import java.util.Scanner;

public class Jadecalc {
     public static void main(String[] args){
        Scanner ask = new Scanner(System.in);

        
        System.out.println("Character Banner or Weapon Banner? (CB or WB)");
        String CBWB = ask.nextLine();

        if (CBWB.equals("CB")){
            //Stellar Jades Amount
                System.out.println("How many Star Rail Special Passes do you have? (Please Enter Number Value)");
                int InterF = ask.nextInt() * 160;
                System.out.println("How many Stellar Jades do you have? (Please Enter Number Value)");
                int PRM = ask.nextInt();
                int PAT = InterF + PRM;

            //Pity
                System.out.println("How much pity are you at? (Please Enter Number Value)");
                int PityA = ask.nextInt();


                System.out.println("Which eidolon do you wish to go for? (0, 1, 2, 3, 4, 5, 6)");
                int CLN = ask.nextInt();
                CharacterBanner(CLN, PAT, PityA);
        } else if (CBWB.equals("WB")){
            //Stellar Jades Amount
                System.out.println("How many Star Rail Special Passes do you have? (Please Enter Number Value)");
                int InterF = ask.nextInt() * 160;
                System.out.println("How many Stellar Jades do you have? (Please Enter Number Value)");
                int PRM = ask.nextInt();
                int PAT = InterF + PRM;

            //Pity
                System.out.println("How much pity are you at? (Please Enter Number Value)");
                int PityA = ask.nextInt();


                System.out.println("Which superimposition level do you wish to go for? (1, 2, 3, 4, 5)");
                int RLN = ask.nextInt();
                WeaponBanner(RLN, PAT, PityA);

        }
        ask.close();
    }

    public static void CharacterBanner(int CV, int PA, int Pity){
        System.out.println("Below Displays the Amount of Stellar Jades and Star Rail Special Passes (All of the following are assuming that you go to hard pity (90 Pulls) for each 50/50): ");
        System.out.println();

        int PAL = ((CV + 1) * (90 * 160)) - PA - Pity;
        int PALIF = (PAL / 160); 
        System.out.println("If you're lucky and win all of your 50/50: ");
        System.out.println(PAL + " Stellar Jades");
        System.out.println(PALIF + " Star Rail Special Passes");
        System.out.println();
       
        int PAS = ((CV + 1) * (135 * 160)) - PA - Pity;
        int PASIF = (PAS / 160);
        System.out.println("If you're luck is average where you win half of your 50/50: ");
        System.out.println(PAS + " Stellar Jades");
        System.out.println(PASIF + " Star Rail Special Passes");
        System.out.println();
        
        int PAU = ((CV + 1) * (180 * 160)) - PA - Pity;
        int PAUIF = (PAU / 160);
        System.out.println("If you're unlucky where you win none of your 50/50: ");
        System.out.println(PAU + " Stellar Jades");
        System.out.println(PAUIF + " Star Rail Special Passes");

        System.out.println();
        System.out.println();


        System.out.println("Below Dispalys the Amount of Stellar Jades and Star Rail Special Passes (Assuming that you hit soft pity (75 Pulls) for each 50/50): ");
        System.out.println();

        int PARL = ((CV +1) * (75 * 160)) - PA - Pity;
        int PARLIF = (PARL /160);
        System.out.println("If you're lucky and win all of your 50/50: ");
        System.out.println(PARL + " Stellar Jades");
        System.out.println(PARLIF + " Star Rail Special Passes");
        System.out.println();
       
        int PARS = ((CV +1) * (113 * 160)) - PA - Pity;
        int PARSIF = (PARS / 160);
        System.out.println("If you're luck is average where you win half of your 50/50: ");
        System.out.println(PARS + " Stellar Jades");
        System.out.println(PARSIF + " Star Rail Special Passes");
        System.out.println();
       
        int PARU = ((CV +1) * (150 *160)) - PA - Pity;
        int PARUIF = (PARU / 160);
        System.out.println("If you're unlucky where you win none of your 50/50: ");
        System.out.println(PARU + " Stellar Jades");
        System.out.println(PARUIF + " Star Rail Special Passes");
        System.out.println();
        
    }


    public static void WeaponBanner(int CV, int PA, int Pity){
        System.out.println("Below Displays the Amount of Stellar Jades and Star Rail Special Passes (All of the following are assuming that you go to hard pity (80 Pulls) for each 50/50): ");
        
        int PAL = ((CV) * (80 * 160)) - PA - Pity;
        int PALIF = (PAL / 160); 
        System.out.println("If you're lucky and win all of your 50/50: ");
        System.out.println(PAL + " Stellar Jades");
        System.out.println(PALIF + " Star Rail Special Passes");
        System.out.println();
       
        int PAS = ((CV) * (160 * 160)) - PA - Pity;
        int PASIF = (PAS / 160);
        System.out.println("If you're luck is average where you win half of your 50/50: ");
        System.out.println(PAS + " Stellar Jades");
        System.out.println(PASIF + " Star Rail Special Passes");
        System.out.println();
        
        int PAU = ((CV) * (240 * 160)) - PA - Pity;
        int PAUIF = (PAU / 160);
        System.out.println("If you're unlucky where you win none of your 50/50: ");
        System.out.println(PAU + " Stellar Jades");
        System.out.println(PAUIF + " Star Rail Special Passes");

        System.out.println();
        System.out.println();


        System.out.println("Below Dispalys the Amount of Stellar Jades and Star Rail Special Passes (Assuming that you hit soft pity (75 Pulls) for each 50/50): ");
        
        int PARL = ((CV) * (65 * 160)) - PA - Pity;
        int PARLIF = (PARL /160);
        System.out.println("If you're lucky and win all of your 50/50: ");
        System.out.println(PARL + " Stellar Jades");
        System.out.println(PARLIF + " Star Rail Special Passes");
        System.out.println();
       
        int PARS = ((CV) * (130 * 160)) - PA - Pity;
        int PARSIF = (PARS / 160);
        System.out.println("If you're luck is average where you win half of your 50/50: ");
        System.out.println(PARS + " Stellar Jades");
        System.out.println(PARSIF + " Star Rail Special Passes");
        System.out.println();
       
        int PARU = ((CV) * (195 *160)) - PA - Pity;
        int PARUIF = (PARU / 160);
        System.out.println("If you're unlucky where you win none of your 50/50: ");
        System.out.println(PARU + " Stellar Jades");
        System.out.println(PARUIF + " Star Rail Special Passes");
    }
}
