public class collect {
    public static void main(String args[])
    {
        boolean flag=false;//是否继续抽牌
        boolean[] cardvis = new boolean[4];//花色标志
        int count = 0;//抽卡次数
        while(!flag)
        {
            if(cardvis[0] && cardvis[1] && cardvis[2] && cardvis[3]) {
                flag = true;
                break;
            }

            switch (choose(cardvis))
            {
                case "Spades":
                    cardvis[0]=true;
                    break;
                case "Hearts":
                    cardvis[1]=true;
                    break;
                case "Diamonds":
                    cardvis[2]=true;
                    break;
                case "Clubs":
                    cardvis[3]=true;
                    break;
            }
            count++;
        }
        System.out.println("Number of picks: "+count);
    }
    public static String choose(boolean cardvis[])
    {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] numbers = {"Ace", "2", "3", "4","5", "6", "7", "8","9", "10", "Jack", "Queen", "King"};
        //init
        for(int i=0;i<deck.length;i++)
            deck[i]=i;
        //洗牌
        for(int i=0;i<deck.length;i++)
        {
            int index = (int)(Math.random()*deck.length);//随机
            int temp = deck[i];//交换洗牌
            deck[i] = deck[index];
            deck[index] = temp;
        }
        //抽牌
        int i=(int)(Math.random()*52);
        String suit = suits[deck[i] / 13];
        String number = numbers[deck[i]/13];

        switch (suit)
        {
            case "Spades":
                if(!cardvis[0])
                {System.out.println(number+" of "+suit);cardvis[0] = true;}
                break;
            case "Hearts":
                if(!cardvis[1])
                {System.out.println(number+" of "+suit);cardvis[1] = true;}
                break;
            case "Diamonds":
                if(!cardvis[2])
                {System.out.println(number+" of "+suit);cardvis[2] = true;}
                break;
            case "Clubs":
                if(!cardvis[3])
                {System.out.println(number+" of "+suit);cardvis[3] = true;}
                break;
        }
        return suit;
    }
}
