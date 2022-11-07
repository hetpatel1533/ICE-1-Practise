public class person
{




    // Private instance members
    String m_name;
    int m_age;

    // Getters and setters
    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        this.m_name = name;
    }

    public int getAge()
    {
        return m_age;
    }

    public void setAge(int age)
    {
        this.m_age = age;
    }

    public void set(String name, int age)
    {
        setName(name);
        setAge(age);
    }

    // Constructers
    public person(String name, int age)
    {
        this.m_name = name;
        this.m_age = age;
    }

    public person()
    {
        m_name = "unknown";
        m_age = 0;
    }

    // Public methods



    public void saysHello()
    {
        System.out.println( getName() + " Says Hello");
    }

    // Private methods


    // Overloaded methods
    @Override
    public String toString()
    {
        return "person(Name=" + getName() + ", Age=" + getAge() + " )";
    }
}
