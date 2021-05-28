package com.onebill.training.ass.threads;

import java.io.*;
class Studentinfo implements Serializable
{
    String name;
    int rid;
    Studentinfo(String n, int r)
    {
    this.name = n;
    this.rid = r;
    }
}
public class SerializationDemo {

	public static void main(String[] args) {
		try
        {
            Studentinfo si = new Studentinfo("karthika", 104);
            FileOutputStream fos = new FileOutputStream("Student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(si);
            oos.flush();
            oos.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
	}

}
