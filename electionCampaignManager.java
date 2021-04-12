import java.util.*;
public class electionCampaignManager{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the number of voters:");
        int voterCount = input.nextInt();
        int kerryVotes = 0;
        int bushVotes = 0;
        int goreVotes = 0;
        System.out.println("The three candidates running for office are: Kerry, Bush, and Gore");
        for(int i = 0; i<voterCount; i++){
            System.out.println("Voter Number" + (i+1) + ": ");
            
            System.out.println("Rank 1: ");
            String currentVote = input.next();
            if(currentVote.equals("kerry")){
                kerryVotes = kerryVotes+3;
            }
            else if(currentVote.equals("bush")){
                bushVotes = bushVotes+3;
            }
            else{
                goreVotes = goreVotes+3;
            }
            
            System.out.println("Rank 2: ");
            currentVote = input.next();
            if(currentVote.equals("kerry")){
                kerryVotes = kerryVotes+2;
            }
            else if(currentVote.equals("bush")){
                bushVotes = bushVotes+2;
            }
            else{
                goreVotes = goreVotes+2;
            }
            
             System.out.println("Rank 3: ");
            currentVote = input.next();
            if(currentVote.equals("kerry")){
                ++kerryVotes;
            }
            else if(currentVote.equals("bush")){
                ++bushVotes;
            }
            else{
                ++goreVotes;
            }           
        }
        
        System.out.println("The candidate with the most votes, and the winner of the election is: ");
        if(kerryVotes>bushVotes && kerryVotes>goreVotes){
            System.out.println("John Kerry");
        }
        else if(bushVotes>kerryVotes && bushVotes>goreVotes){
            System.out.println("George Bush");
        }
        else if(goreVotes>bushVotes && goreVotes>kerryVotes){
            System.out.println("Al Gore");
        }
        else if( kerryVotes == bushVotes || kerryVotes == goreVotes || bushVotes == goreVotes){
            System.out.println("A tie has occured");
        }
        
    }
}
