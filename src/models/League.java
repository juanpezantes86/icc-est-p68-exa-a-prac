package models;

public class League {
    private String name;
    private Team[] teams;

    public League(String name, Team[] teams) {
        this.name = name;
        this.teams = teams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team[] getTeams() {
        return teams;
    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
    }

    public int getTotalActiveGoals() {
        int totalgoals = 0;

        for(Team team : teams) {
            for(Player player : team.getPlayers()) {
                if(player.isActive()) {
                    totalgoals += player.getGoals();
                }
            }
        }
        return totalgoals;
    }

}
