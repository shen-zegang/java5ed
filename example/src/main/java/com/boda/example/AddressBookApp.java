package com.boda.example;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;

public class AddressBookApp extends Application {
    private ListView<Contact> contactListView;
    private ObservableList<Contact> contactList;
    private TextField nameField, birthdayField, emailField, addressField, cityField, phoneField, zipField;
    private Button newButton, deleteButton, editButton, saveButton, cancelButton;
    private ContactDAO contactDAO;
    private Contact selectedContact;

    @Override
    public void start(Stage primaryStage) {
        // 初始化数据库连接
        Connection connection = connectToDatabase();
        contactDAO = new ContactDAOImpl(connection);

        // 初始化UI组件
        contactListView = new ListView<>();
        contactList = FXCollections.observableArrayList(contactDAO.getAllContacts());
        contactListView.setItems(contactList);

        // 列表项只显示联系人姓名
        contactListView.setCellFactory(param -> new ListCell<>() {
            @Override
            protected void updateItem(Contact item, boolean empty) {
                super.updateItem(item, empty);
                setText(empty || item == null ? "" : item.getName());
            }
        });

        // 点击列表项时设置选中联系人
        contactListView.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                selectedContact = newSelection;
                populateForm(selectedContact);
            }
        });

        // 表单字段
        nameField = new TextField();
        birthdayField = new TextField();
        emailField = new TextField();
        addressField = new TextField();
        cityField = new TextField();
        phoneField = new TextField();
        zipField = new TextField();

        // 按钮
        newButton = new Button("新建");
        deleteButton = new Button("删除");
        editButton = new Button("修改");
        saveButton = new Button("保存");
        cancelButton = new Button("取消");

        // 布局
        GridPane formPane = new GridPane();
        formPane.setHgap(10);
        formPane.setVgap(10);
        formPane.setPadding(new Insets(10));
        formPane.add(new Label("姓名:"), 0, 0);
        formPane.add(nameField, 1, 0);
        formPane.add(new Label("出生日期:"), 0, 1);
        formPane.add(birthdayField, 1, 1);
        formPane.add(new Label("电子邮箱:"), 0, 2);
        formPane.add(emailField, 1, 2);
        formPane.add(new Label("街道:"), 0, 3);
        formPane.add(addressField, 1, 3);
        formPane.add(new Label("城市:"), 0, 4);
        formPane.add(cityField, 1, 4);
        formPane.add(new Label("电话:"), 0, 5);
        formPane.add(phoneField, 1, 5);
        formPane.add(new Label("邮政编码:"), 0, 6);
        formPane.add(zipField, 1, 6);

        HBox buttonBox = new HBox(10, newButton, deleteButton, editButton, saveButton, cancelButton);
        buttonBox.setPadding(new Insets(10));
        formPane.add(buttonBox, 1, 7);

        BorderPane root = new BorderPane();
        root.setLeft(contactListView);
        root.setCenter(formPane);
        //root.setBottom(buttonBox);
        BorderPane.setMargin(contactListView, new Insets(10));
        BorderPane.setMargin(formPane, new Insets(10));

        // 按钮事件
        newButton.setOnAction(e -> clearForm());
        deleteButton.setOnAction(e -> deleteSelectedContact());
        editButton.setOnAction(e -> editSelectedContact());
        saveButton.setOnAction(e -> saveContact());
        cancelButton.setOnAction(e -> clearForm());

        // 显示窗口
        Scene scene = new Scene(root, 800, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("通讯录管理系统");
        primaryStage.show();
    }

    private Connection connectToDatabase() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/AddressBook", "root", "123456");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void clearForm() {
        nameField.clear();
        birthdayField.clear();
        emailField.clear();
        addressField.clear();
        cityField.clear();
        phoneField.clear();
        zipField.clear();
        selectedContact = null;
    }

    private void populateForm(Contact contact) {
        nameField.setText(contact.getName());
        birthdayField.setText(contact.getBirthday());
        emailField.setText(contact.getEmail());
        addressField.setText(contact.getAddress());
        cityField.setText(contact.getCity());
        phoneField.setText(contact.getPhone());
        zipField.setText(contact.getZip());
    }

    private void saveContact() {
        if (selectedContact == null) {
            // 新建联系人
            Contact contact = new Contact(
                    -1, // 临时ID，数据库会自动生成
                    nameField.getText(),
                    birthdayField.getText(),
                    emailField.getText(),
                    addressField.getText(),
                    cityField.getText(),
                    phoneField.getText(),
                    zipField.getText()
            );
            contactDAO.addContact(contact);
        } else {
            // 更新联系人
            selectedContact.setName(nameField.getText());
            selectedContact.setBirthday(birthdayField.getText());
            selectedContact.setEmail(emailField.getText());
            selectedContact.setAddress(addressField.getText());
            selectedContact.setCity(cityField.getText());
            selectedContact.setPhone(phoneField.getText());
            selectedContact.setZip(zipField.getText());
            contactDAO.updateContact(selectedContact);
        }

        refreshContactList();
        clearForm();
    }

    private void editSelectedContact() {
        selectedContact = contactListView.getSelectionModel().getSelectedItem();
        if (selectedContact != null) {
            populateForm(selectedContact);
        }
    }

    private void deleteSelectedContact() {
        selectedContact = contactListView.getSelectionModel().getSelectedItem();
        if (selectedContact != null) {
            contactDAO.deleteContact(selectedContact.getId());
            refreshContactList();
            clearForm();
        }
    }

    private void refreshContactList() {
        contactList.setAll(contactDAO.getAllContacts());
    }

    public static void main(String[] args) {
        launch(args);
    }
}


