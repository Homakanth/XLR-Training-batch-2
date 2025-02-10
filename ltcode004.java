import java.util.Scanner;

// Definition for singly-linked list node
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class ltcode004 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Dummy node to simplify result list construction
        ListNode current = dummyHead;
        int carry = 0; // Initialize carry

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; // Start with the carry from the previous addition

            if (l1 != null) { // Add value from l1 if available
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) { // Add value from l2 if available
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10; // Calculate carry for the next digit
            current.next = new ListNode(sum % 10); // Create a new node with the digit
            current = current.next; // Move to the next node
        }

        return dummyHead.next; // Return the resulting list, skipping the dummy head
    }

    // Helper method to build a linked list from user input
    private ListNode buildListFromInput(Scanner scanner) {
        System.out.println("Enter the digits of the number in reverse order (e.g., 3 4 2 for 243). Type -1 to end:");
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;

        while (true) {
            int val = scanner.nextInt();
            if (val == -1) break; // End input on -1
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummyHead.next; // Return the constructed list, skipping the dummy head
    }

    // Helper method to print a linked list
    private void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ltcode004 solution = new ltcode004();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first number:");
        ListNode l1 = solution.buildListFromInput(scanner);

        System.out.println("Input the second number:");
        ListNode l2 = solution.buildListFromInput(scanner);

        // Add the two numbers
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result
        System.out.println("Resultant linked list:");
        solution.printList(result);

        scanner.close();
    }
}