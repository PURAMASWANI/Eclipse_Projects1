package sessions;

public class VotingAppUC {
    private String name;
    private String votingRight;
    private int age;

    public void setName(String name) {
    	this.name = name;
    	}
    public void setVotingRight(String votingRight) {
    	this.votingRight = votingRight;
    	}
    public void setAge(int age) {
    	this.age = age;
    	}

    public String getName() {
    	return name;
    	}
    public String getVotingRight() {
    	return votingRight;
    	}
    public int getAge() {
    	return age;
    	}

    public static void main(String[] args) {
        VotingAppUC p = new VotingAppUC();
        p.setName("Ashvini");
        p.setVotingRight("Eligible");
        p.setAge(25);
        System.out.println("Voter name is " + p.getName());
        System.out.println("Eligible to Vote? " + p.getVotingRight());
        System.out.println("Voter Age: " + p.getAge());
    }
}
/*package sessions;
public class VotingAppUC{
	private String name ;
	private String VotingRight ;
	private int age ;
	public void setName(String)*/

