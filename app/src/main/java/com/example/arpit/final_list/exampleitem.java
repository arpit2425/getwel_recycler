package com.example.arpit.final_list;

public class exampleitem {
    private int img,icon1,icon2;
    private String txt1,txt2,txt3,txt4;
    public exampleitem(int img,int icon1,int icon2,String txt1,String txt2,String txt3,String txt4)
    {
        this.img=img;
       this.icon1=icon1;
        this.icon2=icon2;
        this.txt1=txt1;
        this.txt2=txt2;
        this.txt3=txt3;
        this.txt4=txt4;

    }
    public void change()
    {
     int m=Integer.parseInt(txt4);
     m++;
     txt4=Integer.toString(m);
    }
    public void changeDecrease()
    {
        int m=Integer.parseInt(txt4);
        if(m!=0)
        m--;
        txt4=Integer.toString(m);
    }
    public int getImg1()
    {
        return img;
    }
    public int getIcon1()
    {
        return icon1;
    }
    public int getIcon2()
    {
        return icon2;
    }

    public String getTxt1() {
        return txt1;
    }

    public String getTxt2() {
        return txt2;
    }

    public String getTxt3() {
        return txt3;
    }

    public String getTxt4() {
        return txt4;
    }
}
