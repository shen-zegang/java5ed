package com.boda.example;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ContactManager extends Application {

    // 数据模型
    private ObservableList<Person> contactList = FXCollections.observableArrayList();
    private ListView<Person> contactListView = new ListView<>();
    private TextField firstNameField = new TextField();
    private TextField lastNameField = new TextField();
    private TextArea notesField = new TextArea();
    private Button newButton = new Button("New");
    private Button updateButton = new Button("Update");
    private Button deleteButton = new Button("Delete");

    @Override
    public void start(Stage primaryStage) {
        // 初始化数据
        initSampleData();

        // 左侧联系人列表
        contactListView.setItems(contactList);
        contactListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        contactListView.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                loadPersonDetails(newSelection);
            }
        });

        // 右侧表单布局
        GridPane formPane = createFormPane();

        // 按钮操作
        newButton.setOnAction(e -> handleNewContact());
        updateButton.setOnAction(e -> handleUpdateContact());
        deleteButton.setOnAction(e -> handleDeleteContact());

        // 主布局
        BorderPane root = new BorderPane();
        root.setLeft(contactListView);
        root.setCenter(formPane);
        BorderPane.setMargin(contactListView, new Insets(10));
        BorderPane.setMargin(formPane, new Insets(10));

        // 创建场景
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("Contact Manager");
        primaryStage.setScene(scene);
        primaryStage.show();

        // 默认选择第一个联系人
        if (!contactList.isEmpty()) {
            contactListView.getSelectionModel().select(0);
        }
    }

    private void initSampleData() {
        contactList.addAll(
                new Person("Marylou", "Berube", "random notes 1"),
                new Person("Elli", "Combes", "random notes 2"),
                new Person("Herb", "Dinapoli", "random notes 3"),
                new Person("Flossie", "Goehring", "random notes 4"),
                new Person("Shawanna", "Goehring", "random notes 5"),
                new Person("Zenia", "Linwood", "random notes 6"),
                new Person("Magdalen", "Meadors", "random notes 7"),
                new Person("Ethan", "Nieto", "random notes 8"),
                new Person("Waldo", "Soller", "random notes 9"),
                new Person("Andy", "Toupin", "random notes 10")
        );
    }

    private GridPane createFormPane() {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // 表单标签和输入字段
        gridPane.add(new Label("First:"), 0, 0);
        gridPane.add(firstNameField, 1, 0);

        gridPane.add(new Label("Last:"), 0, 1);
        gridPane.add(lastNameField, 1, 1);

        gridPane.add(new Label("Notes:"), 0, 2);
        notesField.setPrefHeight(100);
        gridPane.add(notesField, 1, 2);

        // 按钮
        HBox buttonBox = new HBox(10, newButton, updateButton, deleteButton);
        gridPane.add(buttonBox, 1, 3);

        return gridPane;
    }

    private void loadPersonDetails(Person person) {
        firstNameField.setText(person.getFirstName());
        lastNameField.setText(person.getLastName());
        notesField.setText(person.getNotes());
    }

    private void handleNewContact() {
        String firstName = firstNameField.getText().trim();
        String lastName = lastNameField.getText().trim();
        String notes = notesField.getText().trim();

        if (firstName.isEmpty() || lastName.isEmpty()) {
            showAlert("Validation Error", "First and Last names cannot be empty.");
            return;
        }

        Person newPerson = new Person(firstName, lastName, notes);
        contactList.add(newPerson);
        contactListView.getSelectionModel().select(newPerson);
        clearForm();
    }

    private void handleUpdateContact() {
        Person selectedPerson = contactListView.getSelectionModel().getSelectedItem();
        if (selectedPerson == null) {
            showAlert("No Selection", "No contact selected to update.");
            return;
        }

        String firstName = firstNameField.getText().trim();
        String lastName = lastNameField.getText().trim();
        String notes = notesField.getText().trim();

        if (firstName.isEmpty() || lastName.isEmpty()) {
            showAlert("Validation Error", "First and Last names cannot be empty.");
            return;
        }

        selectedPerson.setFirstName(firstName);
        selectedPerson.setLastName(lastName);
        selectedPerson.setNotes(notes);
        contactListView.refresh();
    }

    private void handleDeleteContact() {
        Person selectedPerson = contactListView.getSelectionModel().getSelectedItem();
        if (selectedPerson == null) {
            showAlert("No Selection", "No contact selected to delete.");
            return;
        }

        contactList.remove(selectedPerson);
        clearForm();
    }

    private void clearForm() {
        firstNameField.clear();
        lastNameField.clear();
        notesField.clear();
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }

    // 数据模型类
    public static class Person {
        private String firstName;
        private String lastName;
        private String notes;

        public Person(String firstName, String lastName, String notes) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.notes = notes;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getNotes() {
            return notes;
        }

        public void setNotes(String notes) {
            this.notes = notes;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }
}

