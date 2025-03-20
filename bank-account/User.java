

 

class user {
int userId;
String name;
String email;
String password;    // for security hashed
String role;   //   admin, customer
List<Account> accounts ;  //the accounts owned by the customer this is optional
public void login()
{

}
public void logout()
{

}
public void updateProfile()
{

}
public static void main(String []args)
{

    // main function
}
}

/* 

 A User can have multiple Accounts.
 An Account can have multiple Transactions.
 A Bank manages multiple Accounts and Users.
 A Loan is associated with an Account.
 A Notification is sent to a User. 
 
 */
