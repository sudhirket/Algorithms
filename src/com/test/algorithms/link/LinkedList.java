package com.test.algorithms.link;

public class LinkedList {
	private Link first; // ref to first link on list

	// ------------------------------------------------------------

	public LinkedList() // constructor
	{
		first = null; // no items on list yet
	}

	// ------------------------------------------------------------

	public boolean isEmpty() // true if list is empty
	{
		return (first == null);
	}

	// ------------------------------------------------------------

	// insert at start of list
	public void insertFirst(int id, double dd) { // make new link
		Link newLink = new Link(id, dd);
		newLink.next = first; // newLink --> old first
		first = newLink; // first --> newLink
	}

	// ------------------------------------------------------------

	public Link deleteFirst() // delete first item
	{ // (assumes list not empty)
		Link temp = first; // save reference to link
		first = first.next; // delete it: first-->old next
		return temp; // return deleted link
	}

	// ------------------------------------------------------------

	public void displayList() {
		System.out.print("List (first-->last): ");
		Link current = first; // start at beginning of list
		while (current != null) // until end of list,
		{
			current.displayLink(); // print data
			current = current.next; // move to next link
		}
		System.out.println("");
	}

	// ------------------------------------------------------------

	public static void main(String[] args) {
		LinkedList theList = new LinkedList(); // make new list
		theList.insertFirst(22, 2.99); // insert four items
		theList.insertFirst(44, 4.99);
		theList.insertFirst(66, 6.99);
		theList.insertFirst(88, 8.99);
		theList.displayList(); // display list
		while (!theList.isEmpty()) // until it's empty,
		{
			Link aLink = theList.deleteFirst(); // delete link
			System.out.print("Deleted "); // display it
			aLink.displayLink();
			System.out.println("");
		}
		theList.displayList(); // display list
	} // end main()
} // end class LinkListApp

