import java.util.Scanner;


public class Primocalc {
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);

        
        System.out.println("Character Banner or Weapon Banner? (CB or WB)");
        String CBWB = ask.nextLine();

        if (CBWB.equals("CB")){
            //Primogems Amount
                System.out.println("How many intertwined fates do you have? (Please Enter Number Value)");
                int InterF = ask.nextInt() * 160;
                System.out.println("How many primogems do you have? (Please Enter Number Value)");
                int PRM = ask.nextInt();
                int PAT = InterF + PRM;

            //Pity
                System.out.println("How much pity are you at? (Please Enter Number Value)");
                int PityA = ask.nextInt();
            
            //Constellation Amount
                System.out.println("What constellation do you have? (Type -1 if you don't have the character)");
                int OCL = ask.nextInt();

                System.out.println("Which constellation do you wish to go for? (0, 1, 2, 3, 4, 5, 6)");
                int CLN = ask.nextInt();
                CLN -= OCL;
                CharacterBanner(CLN, PAT, PityA);
        } else if (CBWB.equals("WB")){
            //Primogems Amount
                System.out.println("How many intertwined fates do you have? (Please Enter Number Value)");
                int InterF = ask.nextInt() * 160;
                System.out.println("How many primogems do you have? (Please Enter Number Value)");
                int PRM = ask.nextInt();
                int PAT = InterF + PRM;

            //Pity
                System.out.println("How much pity are you at? (Please Enter Number Value)");
                int PityA = ask.nextInt();

            //Constellation Amount
                System.out.println("What refinement level do you have? (Type 0 if you don't have any)");
                int OCL = ask.nextInt();


                System.out.println("Which refinement level do you wish to go for? (1, 2, 3, 4, 5)");
                int RLN = ask.nextInt();
                RLN -= OCL;
                WeaponBanner(RLN, PAT, PityA);

        }
        ask.close();
    }

    public static void CharacterBanner(int CV, int PA, int Pity){
        System.out.println("Below Displays the Amount of PrimoGems and Intertwined Fates (All of the following are assuming that you go to hard pity (90 Pulls) for each 50/50): ");
        System.out.println();

        int PAL = ((CV) * (90 * 160)) - PA - Pity;
        int PALIF = (PAL / 160); 
        System.out.println("If you're lucky and win all of your 50/50: ");
        System.out.println(PAL + " Primogems");
        System.out.println(PALIF + " Intertwined Fates");
        System.out.println();
       
        int PAS = ((CV) * (135 * 160)) - PA - Pity;
        int PASIF = (PAS / 160);
        System.out.println("If you're luck is average where you win half of your 50/50: ");
        System.out.println(PAS + " Primogems");
        System.out.println(PASIF + " Intertwined Fates");
        System.out.println();
        
        int PAU = ((CV) * (180 * 160)) - PA - Pity;
        int PAUIF = (PAU / 160);
        System.out.println("If you're unlucky where you win none of your 50/50: ");
        System.out.println(PAU + " Primogems");
        System.out.println(PAUIF + " Intertwined Fates");

        System.out.println();
        System.out.println();


        System.out.println("Below Dispalys the Amount of PrimoGems and Intertwined Fates (Assuming that you hit soft pity (75 Pulls) for each 50/50): ");
        System.out.println();

        int PARL = ((CV) * (75 * 160)) - PA - Pity;
        int PARLIF = (PARL /160);
        System.out.println("If you're lucky and win all of your 50/50: ");
        System.out.println(PARL + " Primogems");
        System.out.println(PARLIF + " Intertwined Fates");
        System.out.println();
       
        int PARS = ((CV) * (113 * 160)) - PA - Pity;
        int PARSIF = (PARS / 160);
        System.out.println("If you're luck is average where you win half of your 50/50: ");
        System.out.println(PARS + " Primogems");
        System.out.println(PARSIF + " Intertwined Fates");
        System.out.println();
       
        int PARU = ((CV) * (150 *160)) - PA - Pity;
        int PARUIF = (PARU / 160);
        System.out.println("If you're unlucky where you win none of your 50/50: ");
        System.out.println(PARU + " Primogems");
        System.out.println(PARUIF + " Intertwined Fates");
        System.out.println();
        
    }


    public static void WeaponBanner(int CV, int PA, int Pity){
        System.out.println("Below Displays the Amount of PrimoGems and Intertwined Fates (All of the following are assuming that you go to hard pity (80 Pulls) for each 50/50): ");
        
        int PAL = ((CV) * (80 * 160)) - PA - Pity;
        int PALIF = (PAL / 160); 
        System.out.println("If you're lucky and win all of your 50/50: ");
        System.out.println(PAL + " Primogems");
        System.out.println(PALIF + " Intertwined Fates");
        System.out.println();
       
        int PAS = ((CV) * (160 * 160)) - PA - Pity;
        int PASIF = (PAS / 160);
        System.out.println("If you're luck is average where you win half of your 50/50: ");
        System.out.println(PAS + " Primogems");
        System.out.println(PASIF + " Intertwined Fates");
        System.out.println();
        
        int PAU = ((CV) * (240 * 160)) - PA - Pity;
        int PAUIF = (PAU / 160);
        System.out.println("If you're unlucky where you win none of your 50/50: ");
        System.out.println(PAU + " Primogems");
        System.out.println(PAUIF + " Intertwined Fates");

        System.out.println();
        System.out.println();


        System.out.println("Below Dispalys the Amount of PrimoGems and Intertwined Fates (Assuming that you hit soft pity (75 Pulls) for each 50/50): ");
        
        int PARL = ((CV) * (65 * 160)) - PA - Pity;
        int PARLIF = (PARL /160);
        System.out.println("If you're lucky and win all of your 50/50: ");
        System.out.println(PARL + " Primogems");
        System.out.println(PARLIF + " Intertwined Fates");
        System.out.println();
       
        int PARS = ((CV) * (130 * 160)) - PA - Pity;
        int PARSIF = (PARS / 160);
        System.out.println("If you're luck is average where you win half of your 50/50: ");
        System.out.println(PARS + " Primogems");
        System.out.println(PARSIF + " Intertwined Fates");
        System.out.println();
       
        int PARU = ((CV) * (195 *160)) - PA - Pity;
        int PARUIF = (PARU / 160);
        System.out.println("If you're unlucky where you win none of your 50/50: ");
        System.out.println(PARU + " Primogems");
        System.out.println(PARUIF + " Intertwined Fates");
    }
}