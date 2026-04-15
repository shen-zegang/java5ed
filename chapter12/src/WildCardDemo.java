
public void printList(List<?> list){
	for(Object element : list){
		  IO.println(element);
	}
}

void main() {
	 var myList = new ArrayList<Integer>();
	 myList.add(1);
	 myList.add(3);
	 myList.add(5);

	 printList(myList);
}

