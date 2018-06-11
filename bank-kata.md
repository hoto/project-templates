# Bank Kata

Think of your personal bank account experience when in doubt, go for the simplest solution.  

Requirements:  

* Deposit and Withdrawal
* Statement printing in reverse chronological order

```
Given a client makes a deposit of 1000 on 10-01-2018
And a deposit of 2000 on 24-01-2018
And a withdrawal of 500 on 30-01-2018
When she prints her bank statement
Then she would see
date       || transaction || balance
30/01/2018 || -500.00     || 2500.00
24/01/2018 || +2000.00    || 3000.00
10/01/2018 || +1000.00    || 1000.00
```

