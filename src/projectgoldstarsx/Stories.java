package projectgoldstarsx;
import javax.swing.JOptionPane;
public class Stories
{
    public Stories()
    {
        Double sentences = Math.random();
        int sentencesInt = (int)(sentences * 2);
        sentencesInt += 3;
        stories(sentencesInt);
    }
    
    public Stories(int sentences)
    {
        stories(sentences);
    }
    
    private void stories(int sentences)
    {
        String opening, output, setting;
        int openingType;
        double random = Math.random();
        int r = (int)(random * 6);
        if(r == 0)
        {
            opening = "Once upon a time, ";
            setting = "land";
            openingType = 1;
        }
        else if(r == 1)
        {
            opening = "In a land far, far away, ";
            setting = "land";
            openingType = 2;
        }
        else if(r == 2)
        {
            opening = "In an ocean far, far away, ";
            setting = "ocean";
            openingType = 2;
        }
        else if(r == 3)
        {
            opening = "In a castle far, far away, ";
            setting = "castle";
            openingType = 2;
        }
        else if(r == 4)
        {
            opening = "In a palace far, far away, ";
            setting = "palace";
            openingType = 2;
        }
        else
        {
            opening = "In a forest far, far away, ";
            setting = "forest";
            openingType = 2;
        }
        String subject = new String();
        char gender = 'm';
        if("land".equals(setting))
        {
            Double random2 = Math.random();
            int r2 = (int)(random2 * 2);
            if(r2 == 0)
            {
                subject = "person";
                gender = 'm';
            }
            else
            {
                subject = "bear";
                gender = 'm';
            }
        }
        if("ocean".equals(setting))
        {
            Double random2 = Math.random();
            int r2 = (int)(random2 * 2);
            if(r2 == 0)
            {
                subject = "fish";
                gender = 'm';
            }
            else
            {
                subject = "shark";
                gender = 'm';
            }
        }
        if("castle".equals(setting) ||
                "palace".equals(setting))
        {
            Double random2 = Math.random();
            int r2 = (int)(random2 * 2);
            if(r2 == 0)
            {
                subject = "king";
                gender = 'm';
            }
            else
            {
                subject = "queen";
                gender = 'f';
            }
        }
        if("forest".equals(setting))
        {
            Double random2 = Math.random();
            int r2 = (int)(random2 * 2);
            if(r2 == 0)
            {
                subject = "owl";
                gender = 'm';
            }
            else
            {
                subject = "bear";
                gender = 'm';
            }
        }
        String secondPhrase = new String();
        if(openingType == 1)
        {
            secondPhrase = "there was a " + subject + ".";
        }
        if(openingType == 2)
        {
            secondPhrase = "there was once a " + subject + ".";
        }
        String firstSentence = opening + secondPhrase;
        if(sentences == 4)
        {
            String time;
            Double random3 = Math.random();
            int r3 = (int)(random3 * 5);
            if(r3 == 0)
            {
                time = "day";
            }
            else if(r3 == 1)
            {
                time = "morning";
            }
            else if(r3 == 2)
            {
                time = "afternoon";
            }
            else if(r3 == 3)
            {
                time = "evening";
            }
            else
            {
                time = "night";
            }
            String infinitiveVerb, typeOfSchool;
            Double random4 = Math.random();
            int r4 = (int)(random4 * 11);
            if(r4 == 0)
            {
                infinitiveVerb = "to swim";
                typeOfSchool = "swimming";
            }
            else if(r4 == 1)
            {
                infinitiveVerb = "to read";
                typeOfSchool = "reading";
            }
            else if(r4 == 2)
            {
                infinitiveVerb = "to draw";
                typeOfSchool = "drawing";
            }
            else if(r4 == 3)
            {
                infinitiveVerb = "to write a story";
                typeOfSchool = "writing";
            }
            else if(r4 == 4)
            {
                infinitiveVerb = "to paint";
                typeOfSchool = "painting";
            }
            else if(r4 == 5)
            {
                infinitiveVerb = "to cook";
                typeOfSchool = "cooking";
            }
            else if(r4 == 6)
            {
                infinitiveVerb = "to use a computer";
                typeOfSchool = "computer";
            }
            else if(r4 == 7)
            {
                infinitiveVerb = "to fish";
                typeOfSchool = "fishing";
            }
            else if(r4 == 8)
            {
                infinitiveVerb = "to drive";
                typeOfSchool = "driving";
            }
            else if(r4 == 9)
            {
                infinitiveVerb = "to bake";
                typeOfSchool = "baking";
            }
            else
            {
                infinitiveVerb = "to fly a plane";
                typeOfSchool = "flying";
            }
            String secondSentence = "One " + time + ", that " + subject + " decided to learn how " + infinitiveVerb + ".";
            String thirdSentence = "So that " + subject + " went to a " + typeOfSchool + " school.";
            String subject2;
            Double random5 = Math.random();
            int r5 = (int)(random5 * 8);
            if(r5 == 0)
            {
                subject2 = "brother";
            }
            else if(r5 == 1)
            {
                subject2 = "sister";
            }
            else if(r5 == 2)
            {
                subject2 = "mother";
            }
            else if(r5 == 3)
            {
                subject2 = "father";
            }
            else if(r5 == 4)
            {
                subject2 = "friend";
            }
            else if(r5 == 5)
            {
                subject2 = "aunt";
            }
            else if(r5 == 6)
            {
                subject2 = "uncle";
            }
            else
            {
                subject2 = "friend";
            }
            String fourthSentence;
            if(gender == 'm')
            {
                fourthSentence = "After he had learnt how " + infinitiveVerb + ", he told his " + subject2 + " that he had learnt how to " + infinitiveVerb + ".";
            }
            else
            {
                fourthSentence = "After she had learnt how " + infinitiveVerb + ", she told her " + subject2 + " that she had learnt how to " + infinitiveVerb + ".";
            }
            output = firstSentence + "\n" + secondSentence + "\n" + thirdSentence + "\n" + fourthSentence;
        }
        else
        {
            String time;
            Double random3 = Math.random();
            int r3 = (int)(random3 * 5);
            if(r3 == 0)
            {
                time = "day";
            }
            else if(r3 == 1)
            {
                time = "morning";
            }
            else if(r3 == 2)
            {
                time = "afternoon";
            }
            else if(r3 == 3)
            {
                time = "evening";
            }
            else
            {
                time = "night";
            }
            String place;
            boolean land;
            Double random4 = Math.random();
            switch(ProjectGoldStarsX.location)
            {
                case "North America":
                {
                    int r4 = (int)(random4 * 33);
                    if(r4 == 0)
                    {
                        place = "Florida";
                        land = true;
                    }
                    else if(r4 == 1)
                    {
                        place = "England";
                        land = false;
                    }
                    else if(r4 == 2)
                    {
                        place = "France";
                        land = false;
                    }
                    else if(r4 == 3)
                    {
                        place = "Spain";
                        land = false;
                    }
                    else if(r4 == 4)
                    {
                        place = "Russia";
                        land = false;
                    }
                    else if(r4 == 5)
                    {
                        place = "China";
                        land = false;
                    }
                    else if(r4 == 6)
                    {
                        place = "Africa";
                        land = false;
                    }
                    else if(r4 == 7)
                    {
                        place = "Europe";
                        land = false;
                    }
                    else if(r4 == 8)
                    {
                        place = "Australia";
                        land = false;
                    }
                    else if(r4 == 9)
                    {
                        place = "Italy";
                        land = false;
                    }
                    else if(r4 == 10)
                    {
                        place = "India";
                        land = false;
                    }
                    else if(r4 == 11)
                    {
                        place = "Germany";
                        land = false;
                    }
                    else if(r4 == 12)
                    {
                        place = "South Africa";
                        land = false;
                    }
                    else if(r4 == 13)
                    {
                        place = "Ottawa";
                        land = true;
                    }
                    else if(r4 == 14)
                    {
                        place = "Toronto";
                        land = true;
                    }
                    else if(r4 == 15)
                    {
                        place = "Philadelphia";
                        land = true;
                    }
                    else if(r4 == 16)
                    {
                        place = "New York City";
                        land = true;
                    }
                    else if(r4 == 17)
                    {
                        place = "Alaska";
                        land = true;
                    }
                    else if(r4 == 18)
                    {
                        place = "Hawaii";
                        land = false;
                    }
                    else if(r4 == 19)
                    {
                        place = "Vancouver";
                        land = true;
                    }
                    else if(r4 == 20)
                    {
                        place = "Washington, D.C.";
                        land = true;
                    }
                    else if(r4 == 21)
                    {
                        place = "British Colombia";
                        land = true;
                    }
                    else if(r4 == 22)
                    {
                        place = "London";
                        land = false;
                    }
                    else if(r4 == 23)
                    {
                        place = "Barcelona";
                        land = false;
                    }
                    else if(r4 == 24)
                    {
                        place = "Madrid";
                        land = false;
                    }
                    else if(r4 == 25)
                    {
                        place = "Paris";
                        land = false;
                    }
                    else if(r4 == 26)
                    {
                        place = "Switzerland";
                        land = false;
                    }
                    else if(r4 == 27)
                    {
                        place = "Texas";
                        land = true;
                    }
                    else if(r4 == 28)
                    {
                        place = "Michigan";
                        land = true;
                    }
                    else if(r4 == 29)
                    {
                        place = "Maine";
                        land = true;
                    }
                    else if(r4 == 30)
                    {
                        place = "Quebec";
                        land = true;
                    }
                    else if(r4 == 31)
                    {
                        place = "Brazil";
                        land = true;
                    }
                    else
                    {
                        place = "Argentina";
                        land = true;
                    }
                    break;
                }
                case "Europe":
                {
                    int r4 = (int)(random4 * 33);
                    if(r4 == 0)
                    {
                        place = "Portugal";
                        land = false;
                    }
                    else if(r4 == 1)
                    {
                        place = "England";
                        land = false;
                    }
                    else if(r4 == 2)
                    {
                        place = "France";
                        land = false;
                    }
                    else if(r4 == 3)
                    {
                        place = "Spain";
                        land = false;
                    }
                    else if(r4 == 4)
                    {
                        place = "Russia";
                        land = false;
                    }
                    else if(r4 == 5)
                    {
                        place = "China";
                        land = false;
                    }
                    else if(r4 == 6)
                    {
                        place = "Africa";
                        land = false;
                    }
                    else if(r4 == 7)
                    {
                        place = "Moscow";
                        land = false;
                    }
                    else if(r4 == 8)
                    {
                        place = "Australia";
                        land = false;
                    }
                    else if(r4 == 9)
                    {
                        place = "Italy";
                        land = false;
                    }
                    else if(r4 == 10)
                    {
                        place = "India";
                        land = false;
                    }
                    else if(r4 == 11)
                    {
                        place = "Germany";
                        land = false;
                    }
                    else if(r4 == 12)
                    {
                        place = "South Africa";
                        land = false;
                    }
                    else if(r4 == 13)
                    {
                        place = "Rome";
                        land = false;
                    }
                    else if(r4 == 14)
                    {
                        place = "Berlin";
                        land = false;
                    }
                    else if(r4 == 15)
                    {
                        place = "Norway";
                        land = false;
                    }
                    else if(r4 == 16)
                    {
                        place = "New York City";
                        land = false;
                    }
                    else if(r4 == 17)
                    {
                        place = "Denmark";
                        land = false;
                    }
                    else if(r4 == 18)
                    {
                        place = "Sweden";
                        land = false;
                    }
                    else if(r4 == 19)
                    {
                        place = "Finland";
                        land = false;
                    }
                    else if(r4 == 20)
                    {
                        place = "Washington, D.C.";
                        land = false;
                    }
                    else if(r4 == 21)
                    {
                        place = "Scotland";
                        land = false;
                    }
                    else if(r4 == 22)
                    {
                        place = "London";
                        land = false;
                    }
                    else if(r4 == 23)
                    {
                        place = "Barcelona";
                        land = false;
                    }
                    else if(r4 == 24)
                    {
                        place = "Madrid";
                        land = false;
                    }
                    else if(r4 == 25)
                    {
                        place = "Paris";
                        land = false;
                    }
                    else if(r4 == 26)
                    {
                        place = "Switzerland";
                        land = false;
                    }
                    else if(r4 == 27)
                    {
                        place = "Greece";
                        land = false;
                    }
                    else if(r4 == 28)
                    {
                        place = "Athens";
                        land = false;
                    }
                    else if(r4 == 29)
                    {
                        place = "Albania";
                        land = false;
                    }
                    else if(r4 == 30)
                    {
                        place = "Iceland";
                        land = false;
                    }
                    else if(r4 == 31)
                    {
                        place = "Brazil";
                        land = false;
                    }
                    else
                    {
                        place = "Argentina";
                        land = false;
                    }
                    break;
                }
                case "Other/I don't want to say": default:
                {
                    int r4 = (int)(random4 * 19);
                    if(r4 == 0)
                    {
                        place = "Canada";
                        land = true;
                    }
                    else if(r4 == 1)
                    {
                        place = "Mexico";
                        land = true;
                    }
                    else if(r4 == 2)
                    {
                        place = "New York";
                        land = true;
                    }
                    else if(r4 == 3)
                    {
                        place = "Florida";
                        land = true;
                    }
                    else if(r4 == 4)
                    {
                        place = "Alaska";
                        land = true;
                    }
                    else if(r4 == 5)
                    {
                        place = "California";
                        land = true;
                    }
                    else if(r4 == 6)
                    {
                        place = "England";
                        land = false;
                    }
                    else if(r4 == 7)
                    {
                        place = "France";
                        land = false;
                    }
                    else if(r4 == 8)
                    {
                        place = "Spain";
                        land = false;
                    }
                    else if(r4 == 9)
                    {
                        place = "Russia";
                        land = false;
                    }
                    else if(r4 == 10)
                    {
                        place = "China";
                        land = false;
                    }
                    else if(r4 == 11)
                    {
                        place = "Africa";
                        land = false;
                    }
                    else if(r4 == 12)
                    {
                        place = "Europe";
                        land = false;
                    }
                    else if(r4 == 13)
                    {
                        place = "Australia";
                        land = false;
                    }
                    else if(r4 == 14)
                    {
                        place = "Texas";
                        land = true;
                    }
                    else if(r4 == 15)
                    {
                        place = "Italy";
                        land = false;
                    }
                    else if(r4 == 16)
                    {
                        place = "India";
                        land = false;
                    }
                    else if(r4 == 17)
                    {
                        place = "Germany";
                        land = false;
                    }
                    else
                    {
                        place = "South Africa";
                        land = false;
                    }
                    break;
                }
            }
            String secondSentence = "One " + time + ", that " + subject + " decided to go to " + place + ".";
            String meansOfTravel;
            Double random5 = Math.random();
            if(land)
            {
            int r5 = (int)(random5 * 4);
            if(r5 == 0)
            {
                meansOfTravel = "an airplane";
            }
            else if(r5 == 1)
            {
                meansOfTravel = "a train";
            }
            else if(r5 == 2)
            {
                meansOfTravel = "a bus";
            }
            else
            {
                meansOfTravel = "a taxi";
            }
            }
            else
            {
                int r5 = (int)(random5 * 2);
                if(r5 == 0)
                {
                    meansOfTravel = "an airplane";
                }
                else
                {
                    meansOfTravel = "a boat";
                }
            }
            String thirdSentence = "So that " + subject + " took " + meansOfTravel + " to " + place + ".";
            output = firstSentence + "\n" + secondSentence + "\n" + thirdSentence;
        }
        JOptionPane.showMessageDialog(null, output, "Stories", JOptionPane.INFORMATION_MESSAGE);
    }
}