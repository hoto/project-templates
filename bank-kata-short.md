# Bank Kata

Requirements:  

Public API:

```java
public class Account {
    public void deposit(int amount) { }
    public void withdrawal(int amount) { }
    public void printStatement() { }
}
```

Acceptance criteria:

```
Given a client makes a deposit of 1000 
And a deposit of 2000 
And a withdrawal of 500
When she prints her bank statement
Then she would see

AMOUNT
1000
2000
-500
```

