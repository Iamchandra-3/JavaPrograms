import java.util.ArrayList;
 class Dotcom
{
    private ArrayList<String> locationCells;

    public void setLocationcells(ArrayList<String> loc)
    {
        locationCells = loc;
    }

    public String checkYourself(String userInput)
    {
        String result = "miss";
    
        int index = locationCells.indexOf(userInput);
        if(index>=0)
        {
            locationCells.remove(index);

            if(locationCells.isEmpty())
            {
                result = "kill";
            }
            else
            {
                result = "hit";
            }
        }
        return result;
    }
}