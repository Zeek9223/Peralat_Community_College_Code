/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tagmaker;

/**
 *
 * @author Ana
 * 
 */
import java.util.Scanner;
        
public class TagMaker {

    String name, org;
    
    public TagMaker()
    {
        name= " ";
        org = " ";
    }
    public TagMaker( String name,String org)
    {
        this.name=name;
        this.org=org;
    }
    
    public void printEmptyTag()
    {
        printTag ("","");
        
    }
    public void setName(String name)
    {
        this.name= name;
    }
    
    public void setOrg(String org)
    {
        this.org= org;
    }
    // method to print void
    
    public void printTag()
    {
        printTag (name,org);
    }
   public void printTag(String n,String o)
   { 
       System.out.println("#############################");
       System.out.printf("### %30S  ###\n","ANNUAL CONFERANCE");
       System.out.println("#############################");
       System.out.printf("### NAME: %-25S   ####\n", n);
       System.out.println("#############################");
       System.out.printf("###ORGANIZATION: %20S   ####\n",o);
       System.out.println("#############################");    
   }
    
   public void clearData()
   {
       this.name="";
       this.org= "";
       
   }
   
   public Static void main(String[] args);
    
    {
        TagMaker t=new TagMaker();
   
    t.setName("Gary");
    t.setOrg("BCC");
    t.printTag ();
    
    }
}
