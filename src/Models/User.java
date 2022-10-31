package Models;

import Interface.IMethodUser;

public class User implements IMethodUser {

    protected String Name;
    protected String SecondName;
    protected int Age;
    protected String Password;
    protected String Role;

    @Override
    public String getName()
    {
        return Name;
    }

    @Override
    public void setName(String name)
    {
        Name=name;
    }

    @Override
    public String getSecondName()
    {
        return SecondName;
    }

    @Override
    public void setSecondName(String secondName)
    {
        SecondName=secondName;
    }

    @Override
    public int getAge()
    {
        return Age;
    }

    @Override
    public void setAge(int age)
    {
        Age=age;
    }

    @Override
    public String getPassword()
    {
        return Password;
    }

    @Override
    public void setPassword(String password) {
        Password = password;
    }

    public String getRole()
    {
        return Role;
    }

    public void setRole(String role)
    {
        Role=role;
    }


}
