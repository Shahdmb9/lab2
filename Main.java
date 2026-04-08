//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

static Scanner scanner=new Scanner(System.in);
public static void main() {
//    Q1. Write a program to find all of the longest word in a given dictionary.
//        Example:
//       ‹ "cat", "dog", "red", "is", "am" 3 Expected Output:
//        'cat", "dog", "red"

//    String[] s={"cat", "dog", "red", "is", "am"};
//
//    int longeeName=s[0].length();
//
//    for(String s1 : s){
//        if(longeeName<s1.length())
//            longeeName=s1.length();
//    }
//    for(String s1:s){
//
//        if(longeeName==s1.length())
//            System.out.print(s1+" ");
//    }


//        2. Write a program that displays the number of occurrences of an element in the array.
//        Original Array:
//        11,1,1,3,3,51
//        Sample Output:
//        3 occurs 2 times
//        1 occurs 3 times
//        9 occurs O time
    //ارجع اشيك عليه كان المطلوب فايند
//    int[] nums = {1,1,1,3,3,5};
//    ArrayList<Integer> a = new ArrayList<>();
//    int count = 0;
//    int num=9;
//    for (int i = 0; i < nums.length; i++) {
//        if(num==nums[i])
//            count++;
//    }
//    System.out.println(num + " has shown " + count);

//    3. Write a program to find the k largest elements in a given array. Elements in the array can be in any order.
//    1
//    Original Array:
//[1, 4, 17, 7, 25, 3, 100]
//    Expected Output:
//    3 largest elements of the said array are:
//    100 25 17
//
//    int[]nums = {1, 4, 17, 7, 25, 3, 100};
//    System.out.println("enter how many largest number you want me to print");
//    int k=scanner.nextInt();
//    int[] result=findKlargestNumber(k,nums);
//    for (int i = 0; i <result.length ; i++) {
//        System.out.print(result[i]+" ");
//
//    }

//    4. Create a method to reverse an array of integers. Implement the method without creating a new array.
//            Original Array:
//[5,4,3,2,1] Expected Output:
//    Reversed Array:
//    12345

//    int[] numbers={5,4,3,2,1};
//    int endIndex=numbers.length-1;
//    for (int i = 0; i < numbers.length/2; i++) {
//        int temp=numbers[i];
//        numbers[i]=numbers[endIndex];
//        numbers[endIndex]=temp;
//        endIndex--;
//    }
//    System.out.println(Arrays.toString(numbers));

//    5. Write a menu driven Java program with following option:
//    1. Accept elements of an array
//    2. Display elements of an array
//    3. Search the element within array
//    4. Sort the array
//    5. To Stop
//    the size of the array should be entered by the user.

//
//    System.out.println("What size do you want the array");
//    int size=scanner.nextInt();
//    int[] nums=new int[size];
//    boolean added=false;
//
//    System.out.println("please choose what you want");
//    int num=0;
//    do{
//        System.out.println("" +
//                "1. Accept elements of an array\n" +
//                "2. Display elements of an array\n" +
//                "3. Search the element within array\n" +
//                "4. Sort the array \n" +
//                "5. To Stop ");
//        num=scanner.nextInt();
//
//        switch (num){
//            case 1:
//                if (added) {
//                    System.out.println("you already added elements");
//                    break;
//                } else {
//                    added = addElemnts(nums);
//                }
//                break;
//            case 2:
//                for(int n : nums)
//                    System.out.print(n+" ");
//                break;
//            case 3:
//                System.out.println("What number you want me to search for?");
//                int n=scanner.nextInt();
//                boolean found=findElement(nums,n);
//                if(!found){
//                    System.out.println("Sorry we did not find your number");
//                }else
//                    System.out.println("the number "+ n + " is found in the array");
//                break;
//            case 4:
//                int[] sorted=sortArray(nums);
//                for (int n1 :sorted)
//                    System.out.print(n1+" ");
//                System.out.println();
//                break;
//            case 5:
//                System.out.println("thank you, see you later");
//        }
//    }while(num!=5);

//    6. Create a method that generates a random number within a given range. Allow the user to specify the range and call the method to display random numbers.
//    Hint: use Random class
//    Sample Output:
//    2
//    Enter the minimum value of the range: 10
//    Enter the maximum value of the range: 100
//    Enter the number of random numbers to generate: 5 Random
//    numbers within the specified range:
//    71 - 98 - 96 - 71 - 71

//    System.out.println("Enter the range you want the random number be between");
//    System.out.println("The start number:");
//    int min = scanner.nextInt();
//    System.out.println("The end number:");
//    int max=scanner.nextInt();
//    System.out.println("Enter how many numbers you want us to generate");
//    int size=scanner.nextInt();
//    //Method calling
//    int[]listOfNumbers = generateRandomsNumber(max, min,size);
//    System.out.println("The generated numbers are");
//    for(int n : listOfNumbers)
//        System.out.print(n+" ");

//    7. Write a program that checks the strength of a password. Create a method that evaluates a password based on criteria like length, inclusion of special characters, and uppercase/lowercase letters.
//     - We have three methods: 
//     checkLength,
//    Enter a password: 3456 Expected Output:
//    Password is weak.

//    String password="aS$86e";
//    int score = passwordCheck(password);
//    System.out.println(score);
//    if(score>=8)
//        System.out.println("Strong Passowrd");
//    else if(score>=5)
//        System.out.println("moderately Passowrd");
//    else System.out.println("weak password");

//    8. Create a method that generates the Fibonacci sequence up to a specified number of terms.
//    Hint: The Fibonacci sequence is a mathematical sequence of numbers that starts with 0 and 1, and each subsequent number in the sequence is the sum of the two preceding ones.
//    Example:
//    Enter the number of Fibonacci terms to generate: 10
//    Expected Output:
//    Fibonacci sequence with 10 terms:
//    0112358132134

//    System.out.println("Enter the number you want to see the Fibonacci sequence of that number");
//    int n = scanner.nextInt();
//    fibSequence(n);


}

private static boolean findElement(int[] nums, int n) {
    boolean found=false;
    int index=-1;
    for (int i = 0; i < nums.length ; i++) {
        if(nums[i]== n) {
            found = true;
            index=i;
            break;
        }
    }
    return found;
}

private static void fibSequence(int n) {

    int currentNum = 0, nextNumber = 1;
    System.out.print(0 + " " + 1 + " "); // Print first two which is always 0 , 1
    for (int i = 2; i < n; i++) {
        int next = currentNum + nextNumber;
        System.out.print(next + " ");
        //shiffting the current and next number
        currentNum = nextNumber;
        nextNumber = next;
    }
}

private static int[] findKlargestNumber(int k,int[] nums) {
    int [] largest=new int[k];
    ArrayList<Integer> checked=new ArrayList<>();
    for (int i = 0; i < largest.length; i++) {
        int max=0;
        for (int j = 0; j < nums.length; j++) {
            if (!checked.contains(j) && nums[j] > nums[max]) {
                max = j;
            }
        }
        largest[i] = nums[max];
        checked.add(max);
    }
    return largest;
}

private static int[] sortArray(int[] nums) {
    int[] sorted=new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        sorted[i]=nums[i];
    }
    for (int i = 0; i < sorted.length-1; i++) {
        for (int j =i+1; j < nums.length; j++) {
            if (sorted[j]> sorted[i]) {
                int temp = sorted[i];
                sorted[i] = sorted[j];
                sorted[j] = temp;
            }
        }
    }
    return sorted;
}


private static int passwordCheck(String password) {
    int lengthScore=checkLength(password);
//     checkSpecialCharacters,
    int specialCharactersScore=checkSpecialCharacters(password);
//     and checkUpperCaseLowerCase,
    int checkUpperLowerScore= checkUpperCaseLowerCase(password);
    int score = lengthScore+checkUpperLowerScore+specialCharactersScore;
    return score;
}

private static int checkUpperCaseLowerCase(String password) {
    boolean isLower=false;
    boolean isUpper=false;
    for (int i = 0; i < password.length(); i++) {
        if(Character.isLowerCase(password.charAt(i)))
            isLower=true;
        if(Character.isUpperCase(password.charAt(i)))
            isUpper=true;
    }
    if(isLower&&isUpper)
        return 3;
    return 0;
}

private static int checkSpecialCharacters(String password) {
    boolean specialCharacters=false;
    for (int i = 0; i < password.length(); i++) {

        if(!Character.isLetterOrDigit(password.charAt(i)) && password.charAt(i)!= ' ' )
            specialCharacters=true;
    }
    if(specialCharacters)
        return 2;
    else
        return 0;
}

private static int checkLength(String password) {
    if(password.length()<=5)
        return 0;
    else if (password.length() == 6 || password.length()==7 )
        return 2;
    else if (password.length()>=8)
        return 3;

    return 0;
}

private static int[] generateRandomsNumber(int max, int min,int size) {
    int[] randoms=new int[size];
    for (int i = 0; i < randoms.length ; i++) {
        randoms[i]=(int)(Math.random() * (max - min + 1)) + min;
    }
     return randoms;
}

private static boolean addElemnts(int[] nums) {

    System.out.println("Enter array elements");
    for (int i = 0; i < nums.length; i++) {
        nums[i] = scanner.nextInt();
    }
    System.out.println("Now your array is full");
    return true;
}
