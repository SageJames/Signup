import java.util.Scanner;
public class User{
	private String name;
	private int Age;
      	private String sex;
	private String pronoun;
	private String favFood;
	private String dislike;
	private String like;
	public Scanner kb = new Scanner(System.in);	
	
	/*
	 * constructor default.
	 */
	public User(){
	}
	
	/*
	 * Setters
	 */
	public void setName(String name){ this.name = name;}
	public void setAge(Int age){this.age = age;}
	public void setSex(String Sex){this.sex = sex;}
	public void setPronoun(String pronoun){this.pronoun = pronoun;}
	public void setFavFood(String favFood) {this.favFood = favFood;}
	public void setDislike(String dislike) {this.dislike= dislike;}
	public void setLike(String like) {this.like = like;}

	/*
	 * Makers
	 */
	public String makeName(){
	System.out.print("Please Enter Your Name: ");
	name = kb.nextLine();
	}
	public int makeAge(){
	System.out.println("Please enter Your Age: "); 
	age = kb.nextInt();
	}
	public String makeSex(){
	System.out.print("Please Enter Your Sex: ");
	//Do more here
	sex = kb.nextLine();
	}
	public String makePronoun(){
	System.out.print("Please Enter Your Preffered Pronoun: ");
	pronoun = kb.nextLine();
	}
	public String makefavFood(){
	System.out.print("Please Enter Your Favorite Food: ");
	favFood = kb.nextLine();
	}
	public String makeDislike(){
	System.out.print("Please Tell Me An Activity You Dislike: ");
	dislike = kb.nextLine();
	}
	public String makeLike(){
	System.out.print("Please Tell Me An Activity You Like: ");
	like = kb.nextLine();
	}

	/*
	 * Getters
	 */
	public String getName() {return name;}
	public int getAge() {return age;}
       	public String getSex() {return sex;}
	public String getPronoun() { return pronoun;}
	public String getFavFood(){ return favFood;}
	public String getDislike(){ return dislike;}
	public String getLike(){return like;}	
}
