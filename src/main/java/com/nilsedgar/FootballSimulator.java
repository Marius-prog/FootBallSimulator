package com.nilsedgar;

import com.nilsedgar.player.*;
import com.nilsedgar.team.Team;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FootballSimulator {

    private static List<Team> teams;

    private static void initializeLeague() {
        List<Player> barcelonaPlayers = new ArrayList<>() {{
            add(new Goalkeeper("Neto", 13));
            add(new Defender("Akieme Rodriguez Sergio", 3));
            add(new Defender("Alba Jordi", 18));
            add(new Defender("Araujo Ronald", 33));
            add(new Defender("Brandariz Movilla Juan", 36));
            add(new Midfielder("Arthur", 8));
            add(new Midfielder("Busquetsas Sergio", 5));
            add(new Midfielder("Collado Alex", 34));
            add(new Midfielder("Monchu Ramon", 10));
            add(new Forward("Griezmann Antoine", 17));
            add(new Forward( "Messi Lionelis", 10));
        }};
        Team barcelona = new Team(barcelonaPlayers, "Barcelona");

        List<Player> realMadridPlayers = new ArrayList<>() {{
            add(new Goalkeeper("Altube Diego", 26));
            add(new Defender("Carvajal Daniel", 2));
            add(new Defender("De La Fuente Barquilla Adrian", 35));
            add(new Defender("Gabriel Militao Eder", 3));
            add(new Defender("Javi Hernandez", 33));
            add(new Midfielder("Asensio Marco", 20));
            add(new Midfielder("Casemiro", 14));
            add(new Midfielder("Diaz Brahim", 21));
            add(new Midfielder("Fidalgo Alvaro", 36));
            add(new Forward("Bale'as Garethas", 11));
            add(new Forward("Jovič Luka", 18));
        }};
        Team realMadrid = new Team(realMadridPlayers, "Real Madrid");

        List<Player> interPlayers = new ArrayList<>() {{
            add(new Goalkeeper("Berni Tommaso", 46));
            add(new Defender("Bastoni Alessandro", 95));
            add(new Defender("Biraghi Cristiano", 34));
            add(new Defender("Dimarco Federico", 21));
            add(new Defender("Godinas Diego", 2));
            add(new Midfielder("Agoume Lucien", 32));
            add(new Midfielder("Asamoah Kwadwo", 18));
            add(new Midfielder("Barella Nicolo", 23));
            add(new Midfielder("Borja Valero Iglesias", 20));
            add(new Forward("Esposito Sebastiano", 30));
            add(new Forward("Fonseca Matias", 11));
        }};
        Team inter = new Team(interPlayers, "Inter");

        List<Player> milanACPlayers = new ArrayList<>() {{
            add(new Goalkeeper("Reina Pepe", 25));
            add(new Defender("Calabria Davide", 2));
            add(new Defender("Caldara Mattia", 31));
            add(new Defender("Conti Andrea", 12));
            add(new Defender("Duarte Leonardo", 43));
            add(new Midfielder("Bennacer Ismael", 4));
            add(new Midfielder("Biglia Lucas", 20));
            add(new Midfielder("Bonaventura Giacomo", 5));
            add(new Midfielder("Brescianini Marco", 94));
            add(new Forward("Borini Fabio", 11));
            add(new Forward("Ibrahimovičius Zlatanas", 21));
        }};
        Team milanAC = new Team(milanACPlayers, "Milan AC");

        List<Player> juventusACPlayers = new ArrayList<>() {{
            add(new Goalkeeper("Buffonas Gianluigi", 77));
            add(new Defender("Alex Sandro", 12));
            add(new Defender("Beruatto Pietro", 20));
            add(new Defender("Bonucci Leonardo", 19));
            add(new Defender("Chiellini Giorgio", 3));
            add(new Midfielder("Bentancur Rodrigo", 30));
            add(new Midfielder("Can Emre", 23));
            add(new Midfielder("Costa Douglasas", 11));
            add(new Midfielder("Cuadrado Juan", 16));
            add(new Forward("Bernardeschi Federico", 33));
            add(new Forward("Dybala Paulo", 10));
        }};
        Team juventus = new Team(juventusACPlayers, "Juventus");

        List<Player> parisSGPlayers = new ArrayList<>() {{
            add(new Goalkeeper("Bulka Marcin", 18));
            add(new Defender("Bakker Mitchel", 25));
            add(new Defender("Bernatas Juanas", 14));
            add(new Defender("Dagba Colin", 2));
            add(new Defender("Diallo Abdou", 22));
            add(new Midfielder("Aouchiche Adilas", 11));
            add(new Midfielder("Di Maria Angelis", 14));
            add(new Midfielder("Draxler Julian", 10));
            add(new Midfielder("Gueye Idrissa", 13));
            add(new Forward("Cavani Edinsonas", 9));
            add(new Forward("Choupo-Motingas Maximas", 17));
        }};
        Team parisSG = new Team(parisSGPlayers, "Paris SG");

        List<Player> chelseaPlayers = new ArrayList<>() {{
            add(new Goalkeeper("Arrizabalaga Kepa", 1));
            add(new Defender("Alonso Marcosas", 3));
            add(new Defender("Azpilicueta Cesaras", 28));
            add(new Defender("Christensen Andreas", 4));
            add(new Defender("Emerson", 33));
            add(new Midfielder("Anjorin Faustino", 11));
            add(new Midfielder("Barkley Rossas", 8));
            add(new Midfielder("Gilmour Billy", 6));
            add(new Midfielder("Jorginho", 5));
            add(new Forward("Abraham Tammy", 9));
            add(new Forward("Batshuayi Michy", 23));
        }};
        Team chelsea = new Team(chelseaPlayers, "Chelsea");

        List<Player> manchesterCityPlayers = new ArrayList<>() {{
            add(new Goalkeeper("Bravo Claudio", 1));
            add(new Defender("Angelino", 12));
            add(new Defender("Cancelo Joao", 27));
            add(new Defender("Dionkou Richard", 88));
            add(new Defender("Garcia Eric", 50));
            add(new Midfielder("Bernabe Garcia Adrian", 10));
            add(new Midfielder("De Bruyne Kevin", 17));
            add(new Midfielder("Doyle Thomas", 8));
            add(new Midfielder("Fernandinho", 25));
            add(new Forward("Aguero Sergio", 10));
            add(new Forward("Gabriel Jesus", 9));
        }};
        Team manchesterCity = new Team(manchesterCityPlayers, "Manchester city");

        teams = new ArrayList<>() {{
            add(barcelona);
            add(realMadrid);
            add(inter);
            add(milanAC);
            add(juventus);
            add(parisSG);
            add(chelsea);
            add(manchesterCity);
        }};
    }

    private static boolean validOptionSelected(String option) {
        boolean valid = option.equals("1") ||
                option.equals("2") ||
                option.equals("3") ||
                option.equals("4") ||
                option.equals("5") ||
                option.equalsIgnoreCase("Q");
        if (!valid) {
            System.out.print("Please select a valid option (1,2,3,4,5,Q,q): ");
            return valid;
        } else return valid;
    }

    private static void displayMenu() {
        printBanner();
        String optionSelected = "";
        do {
            printMenuOptions();
            System.out.print("Please pick an option by entering a number (Q or q to quit): ");
            Scanner scanner = new Scanner(System.in);
            do {
                optionSelected = scanner.next();
            } while (!validOptionSelected(optionSelected));

            switch (optionSelected) {
                case "1":
                    displayLeagueTable();  // list all the teams and their statistics (league table)
                    handleOption1();
                    break;
                case "2":
                    break;
                case "3":
                    displayLeagueTable();
                    break;
                case "4":
                    displayScoringTable();
                    break;
                case "5":
                    break;
            }
        } while(!optionSelected.equalsIgnoreCase("Q"));
    }

    static void printBanner(){
        System.out.println("=======================================================");
        System.out.println("============ WELCOME TO FOOTBALL SIMULATOR ============");
        System.out.println("=======================================================");
    }

    static void printMenuOptions(){
        System.out.println("The following options are available: ");
        System.out.println("Press: 1 - you choose which two teams to play against each other.");
        System.out.println("Press: 2 - generate match order (all teams play against each other once).");
        // ... need to write an algorithm that creates the order (pairing algorithm).
        System.out.println("Press: 3 - view the league table."); // 3. League table  TODO :: sorted by all 3 collumns
        System.out.println("Press: 4 - view the scoring league leader table."); // 4. You should be able to show the shooter (assumption: show the ScoringLeague table sorted).
        System.out.println("Press: 5 - configure project / settings");
        // - the playback speed per match, ie how long is the pause between each player action, range: 50-3000 milliseconds
        // - To simulate 90 minutes, set how many action rounds will mean that 90 minutes have passed. Default value: 150, max: 180
        // ... - trukmė žaidimo !== action rounds (5) * playback speed (3000)
    }

    public FootballSimulator() {
    }

    public void start() {
        initializeLeague(); // 0. Create all players, and all teams
        displayMenu();      // 1. Show menu
        // 2. Initiate the match or other action
        // A match should be played by displaying "actions" as text messages.

        // 3. After a match: there will be 3 highlights from the match, eg:
        // - the match's save
        // - the match's goal
        // - the match's break
    }

    private static void displayLeagueTable() {
        teams.sort(Team::compareTo);
        System.out.println("==============================================");
        teams.forEach((Team t) -> System.out.println(t.getFormatedStats()));
        System.out.println("==============================================");
    }

    private static void displayScoringTable() {
        List<Player> allPlayers = new ArrayList<>();
        teams.forEach((Team t) -> allPlayers.addAll(t.getPlayers()));
        allPlayers.sort(Player::compareTo);
        System.out.println("======================================");
        allPlayers.forEach((Player p) -> System.out.println(p.getFormattedStats()));
        System.out.println("======================================");
    }

    private static void handleOption1(){
        Scanner scanner = new Scanner(System.in);
        String firstTeamChosen;
        String secondTeamChosen;
        while(true){
            do {
                System.out.print("Please enter the name of first team: ");
                firstTeamChosen = scanner.nextLine();
            } while(!teamExists(firstTeamChosen));

            do {
                System.out.print("Please enter the name of second team: ");
                secondTeamChosen = scanner.nextLine();
            } while(!teamExists(secondTeamChosen));

            if(firstTeamChosen.equals(secondTeamChosen))
                System.out.println("Please choose two teams that are not the same!");
            else
                break;
        }
        launchTwoTeamsMatch(firstTeamChosen, secondTeamChosen);
    }

    private static boolean teamExists(String teamName){
        return findTeamTeamByName(teamName) != null;
    }

    private static Team findTeamTeamByName(String teamName){
        for (Team team : teams)
            if(team.getName().equals(teamName))
                return team;
        return null;
    }

    private static void launchTwoTeamsMatch(String teamName1, String teamName2) {
        Team team1 = findTeamTeamByName(teamName1);
        Team team2 = findTeamTeamByName(teamName2);
        team1.setCurrentGameGoals(0);
        team2.setCurrentGameGoals(0);
        // TODO :: implement time logic :: To simulate 90 minutes, set how many action rounds will mean that 90 minutes have passed. Default value: 150.
        int playbackSpeed = 300;
        int actionRounds = 150;
        int goalkeeperPosition = 0;

        int playerWBallPosition = 5; // žaidėjas index 5 pradeda
        Team teamWithBall = team2;
        Team teamWithoutBall = team1;

        // ... metame monetą, kuriai komandai atiteks kamuolys
        // ... jei iškrenta daugiau nei 0,5 tuomet pakeičiame defaultus
        if(Math.random() >= 0.5){
            teamWithBall = team1;
            teamWithoutBall = team2;
        }
        System.out.println("Team: " + teamWithBall.getName() + " wins the first ball!");

        // ... main game loop
        while(team1.getCurrentGameGoals() <= 3 && team2.getCurrentGameGoals() <= 3 && actionRounds != 0){
            int forwardOrBackwardAction = teamWithBall.getPlayers().get(playerWBallPosition).getAction();
            System.out.print("Team: " + teamWithBall.getName() + ", player: " + teamWithBall.getPlayers().get(playerWBallPosition).getName());
            if(forwardOrBackwardAction == 1) {
                System.out.print(" moves the ball forward, ");
                int opponentNumber = 10 - playerWBallPosition;
                if (teamWithoutBall.getPlayers().get(opponentNumber).getBreakAbility() > teamWithBall.getPlayers().get(playerWBallPosition).getShooting()) {
                    System.out.println("and looses the ball to: " + teamWithoutBall.getPlayers().get(opponentNumber).getName());
                    Team tmp = teamWithBall;
                    teamWithBall = teamWithoutBall;
                    teamWithoutBall = tmp;
                    playerWBallPosition = opponentNumber;
                } else {
                    int passStrength = teamWithBall.getPlayers().get(playerWBallPosition).getSpeed();
                    if(playerWBallPosition + passStrength >= 10){
                        // ... jei žaidėjo passo jėga >= 10 reiškia mušame įvartį
                        System.out.print("and tries to score");
                        if (((Goalkeeper)teamWithoutBall.getPlayers().get(goalkeeperPosition)).getSavingAbility() >
                                teamWithBall.getPlayers().get(playerWBallPosition).getShooting()) {
                            System.out.println(", but the goalkeeper " + teamWithoutBall.getPlayers().get(goalkeeperPosition).getName() + " saves the day!");
                            Team tmp = teamWithBall;
                            teamWithBall = teamWithoutBall;
                            teamWithoutBall = tmp;
                            playerWBallPosition = goalkeeperPosition;
                        } else {
                            System.out.println("------------------------------------------");
                            System.out.println("and it's a goal by team " + teamWithBall.getName() + "!!!!");
                            System.out.println("------------------------------------------");
                            teamWithBall.setCurrentGameGoals(teamWithBall.getCurrentGameGoals() + 1);
                            Team tmp = teamWithBall;
                            teamWithBall = teamWithoutBall;
                            teamWithoutBall = tmp;
                            playerWBallPosition = 5;
                            continue;
                        }
                    } else {
                        // ... nemušame įvarčio - tiesiog pakeičiam dabar turinčio kamuolį žaidėjo poziciją:
                        playerWBallPosition += passStrength;
                    }
                }
            } else { // jei action'as paduoti atgal kamuolį
                if(playerWBallPosition == goalkeeperPosition){
                    System.out.println("\n-----------------------------------");
                    System.out.println("Self goal by team: " + teamWithBall.getName());
                    System.out.println("-----------------------------------");
                    teamWithoutBall.setCurrentGameGoals(teamWithoutBall.getCurrentGameGoals() + 1);
                } else {
                    playerWBallPosition--;
                    System.out.println(" moves the ball back, to: " + teamWithBall.getPlayers().get(playerWBallPosition).getName());
                }
            }

            // controls the playback speed of the game between use actions
            try { Thread.sleep(playbackSpeed); }
            catch (InterruptedException e) { e.printStackTrace(); }
            actionRounds--;
        }

        if(team1.getCurrentGameGoals() > team2.getCurrentGameGoals()){
            System.out.println("Game over! Team " + team1.getName() + " won!");
        } else if(team1.getCurrentGameGoals() < team2.getCurrentGameGoals()){
            System.out.println("Game over! Team " + team2.getName() + " won!");
        } else {
            System.out.println("Game over! It's a split!");
        }
    }
}
