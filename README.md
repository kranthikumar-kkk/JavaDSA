# Find Maximum Element in a 2D Array (Java)

## Description
This Java program finds the largest element in a 2D integer array.

## Code

```java
public class Main {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println("Maximum element: " + max);
    }
}
```

## Output

```
Maximum element: 9
```

## Time Complexity
- **O(rows × columns)**

## Space Complexity
- **O(1)**

## Author
Your Name:kranthi kumar
