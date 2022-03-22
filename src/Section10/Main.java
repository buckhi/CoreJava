package Section10;

import Section8.Song;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        FootballPlayer joe = new FootballPlayer("joe");
//        BaseballPlayer pat = new BaseballPlayer("pat");
//        SoccerPlayer beckham = new SoccerPlayer("beckham");
//
//        Team<FootballPlayer> adelaideCrows = new Team<>("adelaide crows");
//        adelaideCrows.addPlayer(joe);
////        adelaideCrows.addPlayer(pat);
////        adelaideCrows.addPlayer(beckham);
//
//        System.out.println(adelaideCrows.numPlayers());
//
//        Team<BaseballPlayer> baseballTeam = new Team<>("chicago cubs");
//        baseballTeam.addPlayer(pat);
//
//        Team<SoccerPlayer> brokenTeam = new Team<>("no team");
//        brokenTeam.addPlayer(beckham);
//
//        Team<FootballPlayer> melbourne = new Team<>("melbourne");
//        FootballPlayer banks = new FootballPlayer("gordon");
//        melbourne.addPlayer(banks);
//
//        Team<FootballPlayer> hawthorn = new Team<>("hawthorn");
//        Team<FootballPlayer> fremantle = new Team<>("fremantle");
//
//        hawthorn.matchResult(fremantle,1,0);
//        hawthorn.matchResult(adelaideCrows,3,8);
//
//        adelaideCrows.matchResult(fremantle,2,1);
////        adelaideCrows.matchResult(baseballTeam,1,1);
//
//        System.out.println("ranking");
//        System.out.println(adelaideCrows.getName() + " : " + adelaideCrows.ranking());
//        System.out.println(melbourne.getName() + " : " + melbourne.ranking());
//        System.out.println(fremantle.getName() + " : " + fremantle.ranking());
//        System.out.println(hawthorn.getName() + " : " + hawthorn.ranking());
//
//        System.out.println(adelaideCrows.compareTo(melbourne));
//        System.out.println(adelaideCrows.compareTo(hawthorn));
//        System.out.println(hawthorn.compareTo(adelaideCrows));
//        System.out.println(melbourne.compareTo(fremantle));
//
//
//        ArrayList<Team> teams = null;
//        Collections.sort(teams);

        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("adelaide crows");
        Team<FootballPlayer> melbourne = new Team<>("melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("fremantle");
        Team<BaseballPlayer> baseballTeam = new Team<>("chicago cubs");

        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(adelaideCrows,3,8);

        adelaideCrows.matchResult(fremantle,2,1);


        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);
//        footballLeague.add(baseballTeam);
        footballLeague.showLeagueTable();

                BaseballPlayer pat = new BaseballPlayer("pat");
        SoccerPlayer beckham = new SoccerPlayer("beckham");

        Team rawTeam = new Team(" raw team");
        rawTeam.addPlayer(beckham);
        rawTeam.addPlayer(pat);

        footballLeague.add(rawTeam);

        League<Team> rawLeague = new League<>("raw");
        rawLeague.add(adelaideCrows);
        rawLeague.add(baseballTeam);
        rawLeague.add(rawTeam);

        League reallyRaw = new League("really raw");
        reallyRaw.add(adelaideCrows);
        reallyRaw.add(baseballTeam);
        reallyRaw.add(rawTeam);

    }


}
