import java.lang.Math; 
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class kazujanken extends JFrame implements ActionListener{
	   	
	//Comment nyo na lang string ko tapos lagay nyo address nyo para lumabas images HEEHEH
	String designAdd = "C:\\Users\\Abdullah\\Desktop\\Kazu Janken\\images\\design\\";//Matt
	String cardAdd = "C:\\Users\\Abdullah\\Desktop\\Kazu Janken\\images\\cards\\";//Matt
	String smolCardAdd = "C:\\Users\\Abdullah\\Desktop\\Kazu Janken\\images\\smolcards\\";//Matt
	String iconsAdd = "C:\\Users\\Abdullah\\Desktop\\Kazu Janken\\images\\icons\\";//Matt
	//String designAdd = "C:\\Users\\USER\\Desktop\\schoolwerks\\data struc and algo\\finals library\\Sources\\design\\";//gabe
	//String cardAdd = "C:\\Users\\USER\\Desktop\\schoolwerks\\data struc and algo\\finals library\\Sources\\cards\\";//gabe
	//String smolCardAdd = "C:\\Users\\USER\\Desktop\\schoolwerks\\data struc and algo\\finals library\\Sources\\smolcards\\";//gabe
	//String iconsAdd = "C:\\Users\\USER\\Desktop\\schoolwerks\\data struc and algo\\finals library\\Sources\\icons\\";//gabe
	
	int chosenCard, enemyChoice;
	int choiceEnemy;
	int playerCardCtr, enemyCardCtr;
	int roundCtr;
	int playerType1Ctr, playerType2Ctr, playerType3Ctr;
	int playerColor1Ctr=0, playerColor2Ctr=0, playerColor3Ctr=0;
	int enemyType1Ctr=0, enemyType2Ctr=0, enemyType3Ctr = 0;
	int enemyColor1Ctr=0, enemyColor2Ctr=0, enemyColor3Ctr=0;
	int playerRockWinCtr=1, playerPaperWinCtr=2, playerScissorsWinCtr=3;
	int enemyRockWinCtr=1, enemyPaperWinCtr=2, enemyScissorsWinCtr=3; 
	int stackCtr;
	
	int[] tempPlayerCard;
	int[] tempEnemyCard;
	int[] playerHand;
	int[] enemyHand;
	
	int[] card1;int[] card2;int[] card3;int[] card4;int[] card5;int[] card6;int[] card7;int[] card8;int[] card9;int[] card10;
	int[] card11;int[] card12;int[] card13;int[] card14;int[] card15;int[] card16;int[] card17;int[] card18;int[] card19;int[] card20;
	int[] card21;int[] card22;int[] card23;int[] card24;int[] card25;int[] card26;int[] card27;int[] card28;int[] card29;int[] card30;
	
	int [][] playerWinCard;
	int [][] enemyWinCard;
	
	boolean playerRoundWin, enemyRoundWin;
	boolean goSignal1;
	boolean playerType1, playerType2, playerType3;
    boolean playerRedRock, playerRedPaper, playerRedScissors;
    boolean playerBlueRock, playerBluePaper, playerBlueScissors;
    boolean playerYellowRock, playerYellowPaper, playerYellowScissors;
    boolean playerGreenRock, playerGreenPaper, playerGreenScissors;
    boolean enemyType1, enemyType2, enemyType3;
    boolean enemyRedRock, enemyRedPaper, enemyRedScissors;
    boolean enemyBlueRock, enemyBluePaper, enemyBlueScissors;
    boolean enemyYellowRock, enemyYellowPaper, enemyYellowScissors;
    boolean enemyGreenRock, enemyGreenPaper, enemyGreenScissors;
    boolean playerTypeWin;
    boolean playerColorWin;
    boolean enemyTypeWin;
    boolean enemyColorWin;
	
	Stack<Integer> deckStack;
	
	//Images
	//For JFrame Start
	ImageIcon yellowbg = new ImageIcon(designAdd+"yellow_bg.png");
	ImageIcon purpline = new ImageIcon(designAdd+"purple_lines.png");
	ImageIcon title = new ImageIcon(designAdd+"Title.png");
	ImageIcon rockpaperscissor = new ImageIcon(designAdd+"rock_paper_scissors.png");
	ImageIcon playbutton = new ImageIcon(designAdd+"play.png");
	ImageIcon exit = new ImageIcon(designAdd+"exit.png");
	ImageIcon instructionBtn = new ImageIcon(designAdd+"instructionBtn.png");
	//For JFrame How
	ImageIcon instruction = new ImageIcon(designAdd+"instruction.png");
	//For JFrame Game
	ImageIcon titlesmol = new ImageIcon(designAdd+"title_smol.png");
	ImageIcon circle = new ImageIcon(designAdd+"circle.png");
	ImageIcon esencircle = new ImageIcon(designAdd+"esen_circle.png");
	ImageIcon bot = new ImageIcon(designAdd+"bot.png");
	ImageIcon aisymbol= new ImageIcon(designAdd+"ai_symbol.png");
	ImageIcon blackcard = new ImageIcon(designAdd+"cards_black_enemy.png");
	ImageIcon botsmol = new ImageIcon(designAdd+"bot_smol.png");
	ImageIcon playersmol = new ImageIcon(designAdd+"player.png");
	ImageIcon gamebg = new ImageIcon(designAdd+"game_bg.png");
	ImageIcon back = new ImageIcon(designAdd+"backarrow.png");
	ImageIcon cardback = new ImageIcon(designAdd+"cardback.png");
	ImageIcon landscape = new ImageIcon(designAdd+"card_landscape.png");
	ImageIcon smolplaybutton = new ImageIcon(designAdd+"playbtn.png");
	ImageIcon playerWon = new ImageIcon(designAdd+"playerWon.png");
	ImageIcon playerType = new ImageIcon(designAdd+"playerType.png");
	ImageIcon playerPower = new ImageIcon(designAdd+"playerPower.png");
	ImageIcon enemyWon = new ImageIcon(designAdd+"enemyWon.png");
	ImageIcon enemyType = new ImageIcon(designAdd+"enemyType.png");
	ImageIcon enemyPower = new ImageIcon(designAdd+"enemyPower.png");
	ImageIcon drawPower = new ImageIcon(designAdd+"drawPower.png");
	
	ImageIcon playcard[] = {
	new ImageIcon(cardAdd+"1.png"),new ImageIcon(cardAdd+"2.png"),new ImageIcon(cardAdd+"3.png"),new ImageIcon(cardAdd+"4.png"),new ImageIcon(cardAdd+"5.png"),
	new ImageIcon(cardAdd+"6.png"),new ImageIcon(cardAdd+"7.png"),new ImageIcon(cardAdd+"8.png"),new ImageIcon(cardAdd+"9.png"),new ImageIcon(cardAdd+"10.png"),
	new ImageIcon(cardAdd+"11.png"),new ImageIcon(cardAdd+"12.png"),new ImageIcon(cardAdd+"13.png"),new ImageIcon(cardAdd+"14.png"),new ImageIcon(cardAdd+"15.png"),
	new ImageIcon(cardAdd+"16.png"),new ImageIcon(cardAdd+"17.png"),new ImageIcon(cardAdd+"18.png"),new ImageIcon(cardAdd+"19.png"),new ImageIcon(cardAdd+"20.png"),
	new ImageIcon(cardAdd+"21.png"),new ImageIcon(cardAdd+"22.png"),new ImageIcon(cardAdd+"23.png"),new ImageIcon(cardAdd+"24.png"),new ImageIcon(cardAdd+"25.png"),
	new ImageIcon(cardAdd+"26.png"),new ImageIcon(cardAdd+"27.png"),new ImageIcon(cardAdd+"28.png"),new ImageIcon(cardAdd+"29.png"),new ImageIcon(cardAdd+"30.png"),
	new ImageIcon(cardAdd+"31.png"),new ImageIcon(cardAdd+"32.png"),new ImageIcon(cardAdd+"33.png"),new ImageIcon(cardAdd+"34.png"),new ImageIcon(cardAdd+"35.png"),
	new ImageIcon(cardAdd+"36.png"),new ImageIcon(cardAdd+"37.png"),new ImageIcon(cardAdd+"38.png"),new ImageIcon(cardAdd+"39.png"),new ImageIcon(cardAdd+"40.png"),
	new ImageIcon(cardAdd+"41.png"),new ImageIcon(cardAdd+"42.png"),new ImageIcon(cardAdd+"43.png"),new ImageIcon(cardAdd+"44.png"),new ImageIcon(cardAdd+"45.png"),
	new ImageIcon(cardAdd+"46.png"),new ImageIcon(cardAdd+"47.png"),new ImageIcon(cardAdd+"48.png"),new ImageIcon(cardAdd+"49.png"),new ImageIcon(cardAdd+"50.png"),
	new ImageIcon(cardAdd+"51.png"),new ImageIcon(cardAdd+"52.png"),new ImageIcon(cardAdd+"53.png"),new ImageIcon(cardAdd+"54.png"),new ImageIcon(cardAdd+"55.png"),
	new ImageIcon(cardAdd+"56.png"),new ImageIcon(cardAdd+"57.png"),new ImageIcon(cardAdd+"58.png"),new ImageIcon(cardAdd+"59.png"),new ImageIcon(cardAdd+"60.png")
	};
	
	ImageIcon smolcard[] = {
	new ImageIcon(smolCardAdd+"1.png"),new ImageIcon(smolCardAdd+"2.png"),new ImageIcon(smolCardAdd+"3.png"),new ImageIcon(smolCardAdd+"4.png"),new ImageIcon(smolCardAdd+"5.png"),
	new ImageIcon(smolCardAdd+"6.png"),new ImageIcon(smolCardAdd+"7.png"),new ImageIcon(smolCardAdd+"8.png"),new ImageIcon(smolCardAdd+"9.png"),new ImageIcon(smolCardAdd+"10.png"),
	new ImageIcon(smolCardAdd+"11.png"),new ImageIcon(smolCardAdd+"12.png"),new ImageIcon(smolCardAdd+"13.png"),new ImageIcon(smolCardAdd+"14.png"),new ImageIcon(smolCardAdd+"15.png"),
	new ImageIcon(smolCardAdd+"16.png"),new ImageIcon(smolCardAdd+"17.png"),new ImageIcon(smolCardAdd+"18.png"),new ImageIcon(smolCardAdd+"19.png"),new ImageIcon(smolCardAdd+"20.png"),
	new ImageIcon(smolCardAdd+"21.png"),new ImageIcon(smolCardAdd+"22.png"),new ImageIcon(smolCardAdd+"23.png"),new ImageIcon(smolCardAdd+"24.png"),new ImageIcon(smolCardAdd+"25.png"),
	new ImageIcon(smolCardAdd+"26.png"),new ImageIcon(smolCardAdd+"27.png"),new ImageIcon(smolCardAdd+"28.png"),new ImageIcon(smolCardAdd+"29.png"),new ImageIcon(smolCardAdd+"30.png"),
	new ImageIcon(smolCardAdd+"31.png"),new ImageIcon(smolCardAdd+"32.png"),new ImageIcon(smolCardAdd+"33.png"),new ImageIcon(smolCardAdd+"34.png"),new ImageIcon(smolCardAdd+"35.png"),
	new ImageIcon(smolCardAdd+"36.png"),new ImageIcon(smolCardAdd+"37.png"),new ImageIcon(smolCardAdd+"38.png"),new ImageIcon(smolCardAdd+"39.png"),new ImageIcon(smolCardAdd+"40.png"),
	new ImageIcon(smolCardAdd+"41.png"),new ImageIcon(smolCardAdd+"42.png"),new ImageIcon(smolCardAdd+"43.png"),new ImageIcon(smolCardAdd+"44.png"),new ImageIcon(smolCardAdd+"45.png"),
	new ImageIcon(smolCardAdd+"46.png"),new ImageIcon(smolCardAdd+"47.png"),new ImageIcon(smolCardAdd+"48.png"),new ImageIcon(smolCardAdd+"49.png"),new ImageIcon(smolCardAdd+"50.png"),
	new ImageIcon(smolCardAdd+"51.png"),new ImageIcon(smolCardAdd+"52.png"),new ImageIcon(smolCardAdd+"53.png"),new ImageIcon(smolCardAdd+"54.png"),new ImageIcon(smolCardAdd+"55.png"),
	new ImageIcon(smolCardAdd+"56.png"),new ImageIcon(smolCardAdd+"57.png"),new ImageIcon(smolCardAdd+"58.png"),new ImageIcon(smolCardAdd+"59.png"),new ImageIcon(smolCardAdd+"60.png")
	};
	
	ImageIcon winIcon[] = {
	new ImageIcon(iconsAdd+"MiniRockRed.png"), new ImageIcon(iconsAdd+"MiniRockYellow.png"), new ImageIcon(iconsAdd+"MiniRockBlue.png"), new ImageIcon(iconsAdd+"MiniRockGreen.png"), 
	new ImageIcon(iconsAdd+"MiniPaperRed.png"), new ImageIcon(iconsAdd+"MiniPaperYellow.png"), new ImageIcon(iconsAdd+"MiniPaperBlue.png"), new ImageIcon(iconsAdd+"MiniPaperGreen.png"), 
	new ImageIcon(iconsAdd+"MiniScissorsRed.png"), new ImageIcon(iconsAdd+"MiniScissorsYellow.png"), new ImageIcon(iconsAdd+"MiniScissorsBlue.png"), new ImageIcon(iconsAdd+"MiniScissorsGreen.png"), 
	};
	
	//Font
	Font fntNinja = new Font("Ninja Naruto",Font.BOLD,80);
	
	//JFrames
	JFrame start = new JFrame();
	JFrame how = new JFrame();
	JFrame game = new JFrame();
	
	//JButtons
	//For JFrame Start
	JButton startBtnPlay = new JButton(playbutton);
	JButton startBtnIns = new JButton(instructionBtn);
	JButton startBtnExit = new JButton(exit);
	//For JFrame How
	JButton howBtnBack = new JButton(back);
	//For JFrame Game
	JButton[] gameBtnDeck = {
		new JButton(),new JButton(),new JButton(),
		new JButton(),new JButton()
	};
	JButton gameBtnPlay = new JButton(smolplaybutton);
	JButton gameBtnBack = new JButton(back);
	
	//JTextField
	//For JFrame Game
	JTextField gameTxtPlayerChose = new JTextField(20);
	JTextField gameTxtEnemyChose = new JTextField(20);
	
	//JLabels
	//For JFrame Start
	JLabel startLblTitle = new JLabel(title);
	JLabel startLblBg = new JLabel(yellowbg); 
	JLabel startLblPurp = new JLabel(purpline);
	JLabel startLblRPS = new JLabel(rockpaperscissor);
	//For JFrame How
	JLabel howLblPurp = new JLabel(purpline);
	JLabel howLblInstruct = new JLabel(instruction);
	//For JFrame Game
	JLabel gameLblTitle = new JLabel(titlesmol);
	JLabel gameLblBG = new JLabel(gamebg);
	JLabel gameLblEsenCirc = new JLabel(esencircle);
	JLabel gameLblRedCirc = new JLabel(circle);
	JLabel gameLblCardLandscape = new JLabel(landscape);
	JLabel gameLblMyCard = new JLabel();//PLAYER CARD IN PLAY
	JLabel gameLblAICard = new JLabel();//ENEMY CARD IN PLAY
	JLabel gameLblAISymbol = new JLabel(aisymbol);
	JLabel gameLblBot = new JLabel(bot);
	JLabel gameLblBlackCard = new JLabel(blackcard);
	JLabel gameLblBotSmol = new JLabel(botsmol);
	JLabel gameLblPlayerSmol = new JLabel(playersmol);
	JLabel gameLblDeclare = new JLabel();
	JLabel gameLblDeckCtr = new JLabel();
	
	JLabel gameLblBotWin1 = new JLabel();JLabel gameLblBotWin9 = new JLabel();
	JLabel gameLblBotWin2 = new JLabel();JLabel gameLblBotWin10 = new JLabel();
	JLabel gameLblBotWin3 = new JLabel();JLabel gameLblBotWin11 = new JLabel();
	JLabel gameLblBotWin4 = new JLabel();JLabel gameLblBotWin12 = new JLabel();
	JLabel gameLblBotWin5 = new JLabel();JLabel gameLblBotWin13 = new JLabel();
	JLabel gameLblBotWin6 = new JLabel();JLabel gameLblBotWin14 = new JLabel();
	JLabel gameLblBotWin7 = new JLabel();JLabel gameLblBotWin15 = new JLabel();
	JLabel gameLblBotWin8 = new JLabel();
	
	JLabel gameLblPlayerWin1 = new JLabel();JLabel gameLblPlayerWin9 = new JLabel();
	JLabel gameLblPlayerWin2 = new JLabel();JLabel gameLblPlayerWin10 = new JLabel();
	JLabel gameLblPlayerWin3 = new JLabel();JLabel gameLblPlayerWin11 = new JLabel();
	JLabel gameLblPlayerWin4 = new JLabel();JLabel gameLblPlayerWin12 = new JLabel();
	JLabel gameLblPlayerWin5 = new JLabel();JLabel gameLblPlayerWin13 = new JLabel();
	JLabel gameLblPlayerWin6 = new JLabel();JLabel gameLblPlayerWin14 = new JLabel();
	JLabel gameLblPlayerWin7 = new JLabel();JLabel gameLblPlayerWin15 = new JLabel();
	JLabel gameLblPlayerWin8 = new JLabel();
	
	public kazujanken(){
		
		//JFrame Start format///////////////////////////////////////////////////////////
		start.setSize(1500, 1000); 
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	//start.setUndecorated(true);
    	start.setLocationRelativeTo(null);
        start.setLayout(null);
        start.setTitle("Kazu Janken");
        start.setVisible(true);
        setResizable(false);
        start.setLayout(null);
        
        //JFrame Start adding objects
        start.add(startBtnIns);
        startBtnIns.setBounds(200,575,350,108);
        startBtnIns.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		start.dispose();
        		how.setVisible(true);
        	}
        });
        
        start.add(startBtnExit);
        startBtnExit.setBounds(200,750,350,108);
        startBtnExit.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		System.exit(0);
        	}
        });
        
        start.add(startBtnPlay);
        startBtnPlay.setBounds(200,450,350,108);
        
        start.add(startLblTitle);
        startLblTitle.setBounds(250,150,1112,234);
        
        start.add(startLblPurp);
        startLblPurp.setBounds(0,-25,1500,1000);
        
        start.add(startLblRPS);
        startLblRPS.setBounds(700,500,677,478);
           
        start.add(startLblBg);
        startLblBg.setBounds(0,0,1500,1000);
        
        //JFrame how format////////////////////////////////////////////////////////////
        how.setSize(1500, 1000); 
        how.setLocationRelativeTo(null);
        how.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //how.setUndecorated(true);
        how.setTitle("Kazu Janken");
        how.setLayout(null);
        setResizable(false);
        how.setLayout(null);
        
        //JFrame how adding objects
        how.add(howBtnBack);
        howBtnBack.setBounds(25,30,100,100);
        howBtnBack.setBackground(Color.white);
        howBtnBack.setForeground(Color.white);
        howBtnBack.setBorderPainted(false);
        howBtnBack.setFocusPainted(false);
        howBtnBack.setOpaque(false);
        howBtnBack.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		how.dispose();
        		start.setVisible(true);
        	}
        });
        
        how.add(howLblPurp);
        howLblPurp.setBounds(0,-25,1500,1000);
        
        how.add(howLblInstruct);
        howLblInstruct.setBackground(Color.black);
        howLblInstruct.setBounds(-8,74,1500,810);
        
        //JFrame Game format////////////////////////////////////////////////////////////
        game.setSize(1600, 1000); 
        game.setLocationRelativeTo(null);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //game.setUndecorated(true);
        game.setLayout(null);
        game.setTitle("Kazu Janken");
        setResizable(false);
        game.setLayout(null);
        
        //JFrame Game adding objects
        game.add(gameBtnDeck[0]);
        gameBtnDeck[0].setBounds(25,700,196,236);
        gameBtnDeck[0].addActionListener(this);
        
        game.add(gameBtnDeck[1]);
        gameBtnDeck[1].setBounds(240,700,196,236);
        gameBtnDeck[1].addActionListener(this);
        
        game.add(gameBtnDeck[2]);
        gameBtnDeck[2].setBounds(455,700,196,236);
        gameBtnDeck[2].addActionListener(this);
        
        game.add(gameBtnDeck[3]);
        gameBtnDeck[3].setBounds(670,700,196,236);
        gameBtnDeck[3].addActionListener(this);
        
        game.add(gameBtnDeck[4]);
        gameBtnDeck[4].setBounds(885,700,196,236);
        gameBtnDeck[4].addActionListener(this);
        
        game.add(gameTxtPlayerChose);
        
        game.add(gameTxtEnemyChose);
                
        game.add(gameBtnBack);//Back Button
        gameBtnBack.setBounds(40,25,100,100);
        gameBtnBack.setBackground(Color.white);
        gameBtnBack.setBorderPainted(false);
        gameBtnBack.setFocusPainted(false);
        gameBtnBack.setOpaque(false);
        gameBtnBack.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		game.dispose();
        		start.setVisible(true);
        	}
        });
        
        game.add(gameBtnPlay);//Play Button
        gameBtnPlay.setBounds(260,550,105,105);
        gameBtnPlay.setBackground(Color.white);
        gameBtnPlay.setBorderPainted(false);
        gameBtnPlay.setFocusPainted(false);
        gameBtnPlay.setOpaque(false);
        gameBtnPlay.setEnabled(false);
        gameBtnPlay.addActionListener(this);
        
        game.add(gameLblMyCard);//Your Card in play
        gameLblMyCard.setBounds(600,350,214,300);
        
        game.add(gameLblAICard);//AI Card in play
        gameLblAICard.setBounds(860,350,214,300);
        
        game.add(gameLblBot);
        gameLblBot.setBounds(800-20,20,94,58);
        
        game.add(gameLblBlackCard);
        gameLblBlackCard.setBounds(845-20,100,269,150);
        
        game.add(gameLblAISymbol);
        gameLblAISymbol.setBounds(830-20,0,276,246);
        
        game.add(gameLblBotSmol);
        gameLblBotSmol.setBounds(1330,10+10,47,30);
        
        game.add(gameLblPlayerSmol);
        gameLblPlayerSmol.setBounds(1300,480,99,30);
        
        game.add(gameLblDeclare);
        gameLblDeclare.setBounds(600,250,470,70);
        
        //Bot Win Cards
        game.add(gameLblBotWin1);	gameLblBotWin1.setBounds(1200-25,50+10,100,75);
        
        game.add(gameLblBotWin2);	gameLblBotWin2.setBounds(1325-25,50+10,100,75);
        
        game.add(gameLblBotWin3);	gameLblBotWin3.setBounds(1450-25,50+10,100,75);
        
        game.add(gameLblBotWin4);	gameLblBotWin4.setBounds(1200-25,135+10,100,75);
        
        game.add(gameLblBotWin5);	gameLblBotWin5.setBounds(1325-25,135+10,100,75);
        
        game.add(gameLblBotWin6);	gameLblBotWin6.setBounds(1450-25,135+10,100,75);
        
        game.add(gameLblBotWin7);	gameLblBotWin7.setBounds(1200-25,220+10,100,75);
        
        game.add(gameLblBotWin8);	gameLblBotWin8.setBounds(1325-25,220+10,100,75);
        
        game.add(gameLblBotWin9);	gameLblBotWin9.setBounds(1450-25,220+10,100,75);
        
        game.add(gameLblBotWin10);	gameLblBotWin10.setBounds(1200-25,305+10,100,75);
        
        game.add(gameLblBotWin11);	gameLblBotWin11.setBounds(1325-25,305+10,100,75);
        
        game.add(gameLblBotWin12);	gameLblBotWin12.setBounds(1450-25,305+10,100,75);
        
        game.add(gameLblBotWin13);	gameLblBotWin13.setBounds(1200-25,390+10,100,75);
        
        game.add(gameLblBotWin14);	gameLblBotWin14.setBounds(1325-25,390+10,100,75);
        
        game.add(gameLblBotWin15);	gameLblBotWin15.setBounds(1450-25,390+10,100,75);
        
        //Player Win Cards
        game.add(gameLblPlayerWin1);	gameLblPlayerWin1.setBounds(1200-25,520,100,75);
        
        game.add(gameLblPlayerWin2);	gameLblPlayerWin2.setBounds(1325-25,520,100,75);
        
        game.add(gameLblPlayerWin3);	gameLblPlayerWin3.setBounds(1450-25,520,100,75);
        
        game.add(gameLblPlayerWin4);	gameLblPlayerWin4.setBounds(1200-25,605,100,75);
        
        game.add(gameLblPlayerWin5);	gameLblPlayerWin5.setBounds(1325-25,605,100,75);
        
        game.add(gameLblPlayerWin6);	gameLblPlayerWin6.setBounds(1450-25,605,100,75);
        
        game.add(gameLblPlayerWin7);	gameLblPlayerWin7.setBounds(1200-25,690,100,75);
        
        game.add(gameLblPlayerWin8);	gameLblPlayerWin8.setBounds(1325-25,690,100,75);
        
        game.add(gameLblPlayerWin9);	gameLblPlayerWin9.setBounds(1450-25,690,100,75);
        
        game.add(gameLblPlayerWin10);	gameLblPlayerWin10.setBounds(1200-25,775,100,75);
        
        game.add(gameLblPlayerWin11);	gameLblPlayerWin11.setBounds(1325-25,775,100,75);
        
        game.add(gameLblPlayerWin12);	gameLblPlayerWin12.setBounds(1450-25,775,100,75);
        
        game.add(gameLblPlayerWin13);	gameLblPlayerWin13.setBounds(1200-25,860,100,75);
        
        game.add(gameLblPlayerWin14);	gameLblPlayerWin14.setBounds(1325-25,860,100,75);
        
        game.add(gameLblPlayerWin15);	gameLblPlayerWin15.setBounds(1450-25,860,100,75);
         
        game.add(gameLblTitle);
        gameLblTitle.setBounds(150,0,577,147);
        
        game.add(gameLblDeckCtr);
        gameLblDeckCtr.setBounds(265,350,100,100);
        gameLblDeckCtr.setFont(fntNinja);
        gameLblDeckCtr.setForeground(Color.white);
        
        game.add(gameLblCardLandscape);
        gameLblCardLandscape.setBounds(160,300,300,214);
        
        game.add(gameLblEsenCirc);
        gameLblEsenCirc.setBounds(0,120,593,600);
        
        game.add(gameLblRedCirc);
        gameLblRedCirc.setBounds(0,120,593,600);
        
        game.add(gameLblBG);
        gameLblBG.setBounds(0,-25,1600,1000);
        
        
        
        startBtnPlay.addActionListener(new ActionListener(){//INITIALIZATION OF THE DECK
        	public void actionPerformed(ActionEvent e){
        		start.dispose();
        		game.setVisible(true);
        		
        		//POWER
    			int[] cardPower = new int[30]; //30 cards
    			int power=1;
    	
    			for(int ctr=0; ctr<=29; ctr++){
    				cardPower[ctr] = power; 
    				power++; //assign 1-5 power to 30 cards
    		
    			if (power>5)
    				power = 1; //reset value of power			
    			}
    	
    			//TYPE    	
    			int[] cardType = new int[30]; //30 cards
    			int type=1; // 1=rock , 2=paper , 3=scissors
    	
    			for(int ctr=0; ctr<=29; ctr++){
    				cardType[ctr] = type; 
    				type++; //assign 1-3 type to 30 cards
    		
    			if (type>3)
    				type = 1; //reset value of type			
    			}
  
    			//COLOR
    			int[] cardColor = new int[30]; //30 cards
    			int color=1; // 1=red, 2=blue, 3=yellow, 4=green
    	
    			for(int ctr=0; ctr<=29; ctr++){
    			cardColor[ctr] = color; 
    			color++; //assign 1-4 color to 30 cards
    		
    			if (color>4)
    				color = 1; //reset value of color			
    			}
    	
    			//2 dimensional array
    			int[][] cardData = {cardPower, cardType, cardColor};
    	
    			//CARD FINAL; each will hold 3 values
    			int address = 0; //for 2d array use
    	
    			int[] dummycard = {0,0,0};
    			card1 = new int[3];
    			card2 = new int[3]; 
    			card3 = new int[3]; 
    			card4 = new int[3]; 
    			card5 = new int[3];
    			card6 = new int[3];
    			card7 = new int[3];
    			card8 = new int[3];
    			card9 = new int[3];
    			card10 = new int[3];
    			card11 = new int[3]; 
    			card12 = new int[3];
    			card13 = new int[3];
    			card14 = new int[3];
    			card15 = new int[3];
    			card16 = new int[3];
    			card17 = new int[3];
    			card18 = new int[3];
    			card19 = new int[3];
    			card20 = new int[3];
    			card21 = new int[3];
    			card22 = new int[3];
    			card23 = new int[3];
    			card24 = new int[3];
    			card25 = new int[3];
    			card26 = new int[3];
    			card27 = new int[3];
    			card28 = new int[3];
    			card29 = new int[3];
    			card30 = new int[3];	
    		
    			//inserting power, type, color values into cards	
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card1[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    				address++; //2d array address increment for next loop
    			}
    		
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card2[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    					address++;
    			}
    		
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card3[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    					address++; 
    			}
    		
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card4[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    					address++; 
    			}
    		
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card5[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    					address++; 
    			}
    		
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card6[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    					address++;
    			}
    		
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card7[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    					address++; 
    				}
    		
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card8[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    					address++;
    				}
    		
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card9[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    					address++; 
    				}
    		
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card10[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    					address++;
    				}
    		
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card11[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    					address++;
    				}
    			
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card12[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    					address++;
    			}
    		
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card13[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    					address++;
    			}
    		
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card14[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    					address++;
    			}
    		
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card15[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    					address++;
    			}
    		
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card16[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    					address++;
    			}
    		
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card17[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    					address++;
    			}
    		
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card18[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    					address++;
    			}
    		
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card19[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    					address++;
    			}
    		
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card20[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    					address++;
    			}
    		
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card21[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    					address++;
    			}
    		
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card22[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    					address++;
    			}
    		
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card23[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    					address++;
    			}
    		
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card24[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    					address++;
    			}
    		
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card25[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    					address++;
    			}
    		
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card26[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    					address++;
    			}
    		
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card27[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    					address++;
    			}
    		
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card28[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    					address++;
    			}
    		
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card29[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    					address++;
    			}
    		
    			for (int ctr=0; ctr<=2; ctr++){   		
    				card30[ctr] = cardData[ctr][address];
    				if (ctr == 2)
    					address++;
    			}
    	
        		//DECK SHUFFLE & DISTRIBUTION  	
    			int[] valueHolder = new int[30]; //array that REPRESENTS only the card value
    			deckStack = new Stack<Integer>(); //stack that will contain actual deck
    	
    			//Insert values in valueHolder array
    			for(int ctr=0; ctr<30; ctr++){ 
    				valueHolder[ctr] = ctr;    		
    			}
    	
    			boolean goSignal = true; //for checking of cards if all are pushed (refer to for loop after switch case)
    	
    			//will run until all cards are pushed
    			while (goSignal == true) { 
    	   	
    				int randomCard = (int)(Math.random() * valueHolder.length); //picking random value from 0-29    	
    	   	
    				//Pushing cards into deck
    				switch (randomCard) { 
  						case 0:
  							//to check so will only push once
  							if (valueHolder[randomCard] != -1) {
    							deckStack.push(0); //value of random is same value of case & card
    							valueHolder[randomCard] = -1; 
  							}	
    						break;
  						case 1:
    						if (valueHolder[randomCard] != -1) {
    							deckStack.push(1);
    							valueHolder[randomCard] = -1; 
  							}
    						break;
  						case 2:
    						if (valueHolder[randomCard] != -1) {
    							deckStack.push(2); 
    							valueHolder[randomCard] = -1; 
  							}
    						break;
  						case 3:
    						if (valueHolder[randomCard] != -1) {
    							deckStack.push(3);
    							valueHolder[randomCard] = -1; 
  							}
   							break;
  						case 4:
    						if (valueHolder[randomCard] != -1) {
    							deckStack.push(4);
    							valueHolder[randomCard] = -1; 
  							}
    						break;
  						case 5:
   		 					if (valueHolder[randomCard] != -1) {
   		 						deckStack.push(5); 
    							valueHolder[randomCard] = -1; 
  							}
    						break;
  						case 6:
    						if (valueHolder[randomCard] != -1) {
    							deckStack.push(6); 
    							valueHolder[randomCard] = -1; 
  							}
   							break;
  						case 7:
    						if (valueHolder[randomCard] != -1) {
    							deckStack.push(7); 
    							valueHolder[randomCard] = -1; 
  							}
    						break;
  						case 8:
    						if (valueHolder[randomCard] != -1) {
    							deckStack.push(8); 
    							valueHolder[randomCard] = -1; 
  							}
    						break; 
  						case 9:
    						if (valueHolder[randomCard] != -1) {
    							deckStack.push(9); 
    							valueHolder[randomCard] = -1; 
  							}
    						break;
  						case 10:
    						if (valueHolder[randomCard] != -1) {
    							deckStack.push(10); 
    							valueHolder[randomCard] = -1; 
  							}
    						break;
  						case 11:
    						if (valueHolder[randomCard] != -1) {
    							deckStack.push(11); 
    							valueHolder[randomCard] = -1; 
  							}
    						break;
  						case 12:
    						if (valueHolder[randomCard] != -1) {
    							deckStack.push(12); 
    							valueHolder[randomCard] = -1; 
  							}
    						break;
  						case 13:
    						if (valueHolder[randomCard] != -1) {
    							deckStack.push(13); 
    							valueHolder[randomCard] = -1; 
  							}
    						break;
  						case 14:
    						if (valueHolder[randomCard] != -1) {
    							deckStack.push(14); 
    							valueHolder[randomCard] = -1; 
  							}
    						break;
  						case 15:
    						if (valueHolder[randomCard] != -1) {
    							deckStack.push(15); 
   					 			valueHolder[randomCard] = -1; 
  							}
    						break;
  						case 16:
    						if (valueHolder[randomCard] != -1) {
    							deckStack.push(16); 
    							valueHolder[randomCard] = -1; 
  							}
    						break;
  						case 17:
    						if (valueHolder[randomCard] != -1) {
    							deckStack.push(17); 
    							valueHolder[randomCard] = -1; 
  							}
    						break;
  						case 18:
    						if (valueHolder[randomCard] != -1) {
    							deckStack.push(18); 
    							valueHolder[randomCard] = -1; 
  							}
    						break;
  						case 19:
    						if (valueHolder[randomCard] != -1) {
    							deckStack.push(19); 
    							valueHolder[randomCard] = -1; 
  							}
    						break;
   						case 20:
    						if (valueHolder[randomCard] != -1) {
    							deckStack.push(20); 
    							valueHolder[randomCard] = -1; 
  							}
    						break;
   						case 21:
    						if (valueHolder[randomCard] != -1) {
    							deckStack.push(21); 
    							valueHolder[randomCard] = -1; 
  							}
    						break;
   						case 22:
    						if (valueHolder[randomCard] != -1) {
    							deckStack.push(22); 
    							valueHolder[randomCard] = -1; 
  							}
    						break;
   						case 23:
    						if (valueHolder[randomCard] != -1) {
    							deckStack.push(23); 
    							valueHolder[randomCard] = -1; 
  							}
    						break;
   						case 24:
    						if (valueHolder[randomCard] != -1) {
    							deckStack.push(24); 
    							valueHolder[randomCard] = -1; 
  							}
    						break;
   						case 25:
    						if (valueHolder[randomCard] != -1) {
    							deckStack.push(25); 
    							valueHolder[randomCard] = -1; 
  							}
    						break;
   						case 26:
    						if (valueHolder[randomCard] != -1) {
    							deckStack.push(26); 
    							valueHolder[randomCard] = -1; 
  							}
    						break;
   						case 27:
    						if (valueHolder[randomCard] != -1) {
    							deckStack.push(27); 
    							valueHolder[randomCard] = -1; 
  							}
    						break;
   						case 28:
    						if (valueHolder[randomCard] != -1) {
    							deckStack.push(28); 
    							valueHolder[randomCard] = -1; 
  							}
    						break;
   						case 29:
    						if (valueHolder[randomCard] != -1) {
    							deckStack.push(29); 
    							valueHolder[randomCard] = -1; 
  							}
    						break;
     
					}
		
					//checking if there are still cards not pushed; if pushCtr == array.length, then all cards pushed
					for (int ctr=0, pushCtr=0; ctr<valueHolder.length; ctr++) {		
						if (valueHolder[ctr] == -1){
							pushCtr++;}
						if (pushCtr == valueHolder.length){
							goSignal = false;}
					}
				//seperate bracket from for loop
    			}
    	
    			//CARD PLAYING
    			
    			//print the full deck
    			System.out.println(deckStack);
    			gameLblDeckCtr.setFont(fntNinja);
    			gameLblDeckCtr.setText(String.valueOf(stackCtr));
    			stackCtr = deckStack.size();
    	
    			//drawing 5 cards for player from deck
    			playerHand = new int[5];
    	
    			for (int ctr=0,n=0; ctr<playerHand.length; ctr++,n++){
    				playerHand[ctr] = deckStack.pop();
    				int temp = playerHand[ctr];
    				gameBtnDeck[n].setIcon(smolcard[temp]);
    				stackCtr--;  	
    			}
    	
    			//drawing 5 cards for enemy from deck
    			enemyHand = new int[5];
    	
    			for (int ctr=0; ctr<enemyHand.length; ctr++){
    				enemyHand[ctr] = deckStack.pop();
    				stackCtr--;
    			}
    			
    			gameLblDeckCtr.setText(String.valueOf(stackCtr));
    	
    			//INTIALIZATION FOR ROUND LOOP
    			Scanner scan = new Scanner(System.in); //choosing cards
    			goSignal1 = false; //check if player chosen card is in hand; goSignal 1 is false but turns true if player has the card   	
    	    	
    			//temporary holds card when played so array can be reused===================================================================
    			tempPlayerCard = new int[3];
    			tempEnemyCard = new int[3];
    		
				playerRoundWin = false; //for checking whose card wins
				enemyRoundWin = false; //for checking whose card wins		
		    	
    			//2d array holder of winning cards
    			playerWinCard = new int[20][];
    			enemyWinCard = new int[20][];
    	
    			//putting a dummy card so values wont be null at first check
    			for (int ctr=0; ctr < playerWinCard.length; ctr++){
    				playerWinCard[ctr] = dummycard;
    			}
    	
    			for (int ctr=0; ctr < enemyWinCard.length; ctr++){
    				enemyWinCard[ctr] = dummycard;
    			}
    	
    			playerCardCtr = 0; //to determine which position to place the winning card
    			enemyCardCtr = 0;
        
        		//winning card counters / winning boolean				1 rock, 2 paper, 3 scissor & 1 red, 2 blue, 3 yellow, 4 green
    			playerType1Ctr=0; playerType2Ctr=0; playerType3Ctr=0;
    			playerType1=false; playerType2=false; playerType3=false;
    			playerRedRock=false; playerRedPaper=false; playerRedScissors=false;
    			playerBlueRock=false; playerBluePaper=false; playerBlueScissors=false;
    			playerYellowRock=false; playerYellowPaper=false; playerYellowScissors=false;
    			playerGreenRock=false; playerGreenPaper=false; playerGreenScissors=false;
    			playerColor1Ctr=0; playerColor2Ctr=0; playerColor3Ctr=0;
    	
    			enemyType1Ctr=0; enemyType2Ctr=0; enemyType3Ctr = 0;    	
    			enemyType1=false; enemyType2=false; enemyType3=false;
    			enemyRedRock=false; enemyRedPaper=false; enemyRedScissors=false;
    			enemyBlueRock=false; enemyBluePaper=false; enemyBlueScissors=false;
    			enemyYellowRock=false; enemyYellowPaper=false; enemyYellowScissors=false;
    			enemyGreenRock=false; enemyGreenPaper=false; enemyGreenScissors=false;
   				enemyColor1Ctr=0; enemyColor2Ctr=0; enemyColor3Ctr=0;
    	
    			playerTypeWin = false;
    			playerColorWin = false;
    			enemyTypeWin = false;
    			enemyColorWin = false;
    	
    			roundCtr = 1; //round counter 
    			    	
    			//printing new deck and player+enemy hand
    			System.out.println("\nRound: " + roundCtr);
    			System.out.println("\nDeck: " + deckStack);
    			System.out.println("\nPlayer hand: " + Arrays.toString(playerHand));
    			System.out.println("\nEnemy hand: " + Arrays.toString(enemyHand));
    	
    			//choosing card
        		
    			//check if player chosen card is in hand; goSignal 1 is false but turns true if player has the card
    			for (int ctr = 0; ctr<playerHand.length;ctr++)
    			{
    				if(playerHand[ctr]==chosenCard)
    					goSignal1 = true;
    			}
    			
    			//Resetting all components in JFrame Game
    			for (int x=0;x<playerHand.length;x++){
    				gameBtnDeck[x].setEnabled(true);
    			}
    			
    			gameLblDeclare.setIcon(null);
    			
    			gameLblBotWin1.setIcon(null);gameLblBotWin2.setIcon(null);gameLblBotWin3.setIcon(null);
    			gameLblBotWin4.setIcon(null);gameLblBotWin5.setIcon(null);gameLblBotWin6.setIcon(null);
    			gameLblBotWin7.setIcon(null);gameLblBotWin8.setIcon(null);gameLblBotWin9.setIcon(null);
    			gameLblBotWin10.setIcon(null);gameLblBotWin11.setIcon(null);gameLblBotWin12.setIcon(null);
    			gameLblBotWin13.setIcon(null);gameLblBotWin14.setIcon(null);gameLblBotWin15.setIcon(null);
    			
    			gameLblPlayerWin1.setIcon(null);gameLblPlayerWin2.setIcon(null);gameLblPlayerWin3.setIcon(null);
    			gameLblPlayerWin4.setIcon(null);gameLblPlayerWin5.setIcon(null);gameLblPlayerWin6.setIcon(null);
    			gameLblPlayerWin7.setIcon(null);gameLblPlayerWin8.setIcon(null);gameLblPlayerWin9.setIcon(null);
    			gameLblPlayerWin10.setIcon(null);gameLblPlayerWin11.setIcon(null);gameLblPlayerWin12.setIcon(null);
    			gameLblPlayerWin13.setIcon(null);gameLblPlayerWin14.setIcon(null);gameLblPlayerWin15.setIcon(null);
    			
    			gameLblAICard.setIcon(cardback);
    			gameLblMyCard.setIcon(cardback);
    			
    			playerRockWinCtr=1; playerPaperWinCtr=2; playerScissorsWinCtr=3;
				enemyRockWinCtr=1; enemyPaperWinCtr=2; enemyScissorsWinCtr=3;
			
        	}
        });//END BRACKET OF STARTPLAYBUTTON
        
       	  
	}
	
	public void actionPerformed (ActionEvent e){
			
		if(e.getSource()==gameBtnDeck[0]){
			gameTxtPlayerChose.setText(String.valueOf(playerHand[0]));
			gameBtnPlay.setEnabled(true);
			gameBtnDeck[0].setBounds(25,685,196,236);
			gameBtnDeck[1].setBounds(240,700,196,236);gameBtnDeck[2].setBounds(455,700,196,236);
			gameBtnDeck[3].setBounds(670,700,196,236);gameBtnDeck[4].setBounds(885,700,196,236);
		}
			
		if(e.getSource()==gameBtnDeck[1]){
			gameTxtPlayerChose.setText(String.valueOf(playerHand[1]));
			gameBtnPlay.setEnabled(true);
			gameBtnDeck[1].setBounds(240,685,196,236);
			gameBtnDeck[0].setBounds(25,700,196,236);gameBtnDeck[2].setBounds(455,700,196,236);
			gameBtnDeck[3].setBounds(670,700,196,236);gameBtnDeck[4].setBounds(885,700,196,236);
		}
		
		if(e.getSource()==gameBtnDeck[2]){
			gameTxtPlayerChose.setText(String.valueOf(playerHand[2]));
			gameBtnPlay.setEnabled(true);
			gameBtnDeck[2].setBounds(455,685,196,236);
			gameBtnDeck[0].setBounds(25,700,196,236);gameBtnDeck[1].setBounds(240,700,196,236);
			gameBtnDeck[3].setBounds(670,700,196,236);gameBtnDeck[4].setBounds(885,700,196,236);
		}
			
		if(e.getSource()==gameBtnDeck[3]){
			gameTxtPlayerChose.setText(String.valueOf(playerHand[3]));
			gameBtnPlay.setEnabled(true);
			gameBtnDeck[3].setBounds(670,685,196,236);
			gameBtnDeck[0].setBounds(25,700,196,236);gameBtnDeck[1].setBounds(240,700,196,236);
			gameBtnDeck[2].setBounds(455,700,196,236);gameBtnDeck[4].setBounds(885,700,196,236);
		}	
			
		if(e.getSource()==gameBtnDeck[4]){
			gameTxtPlayerChose.setText(String.valueOf(playerHand[4]));
			gameBtnPlay.setEnabled(true);
			gameBtnDeck[4].setBounds(885,685,196,236);
			gameBtnDeck[0].setBounds(25,700,196,236);gameBtnDeck[1].setBounds(240,700,196,236);
			gameBtnDeck[2].setBounds(455,700,196,236);gameBtnDeck[3].setBounds(670,700,196,236);
		}
			
		if(e.getSource()==gameBtnPlay){
		
			gameBtnDeck[0].setBounds(25,700,196,236);gameBtnDeck[1].setBounds(240,700,196,236);
			gameBtnDeck[2].setBounds(455,700,196,236);gameBtnDeck[3].setBounds(670,700,196,236);
			gameBtnDeck[4].setBounds(885,700,196,236);
			
			System.out.println("\nRound: " + roundCtr);
			System.out.println("\nDeck: " + deckStack);
    		System.out.println("\nPlayer hand: " + Arrays.toString(playerHand));
    		System.out.println("\nEnemy hand: " + Arrays.toString(enemyHand));
			
			chosenCard = Integer.parseInt(gameTxtPlayerChose.getText());
        	gameLblMyCard.setIcon(playcard[chosenCard]);
        	stackCtr--;
				
        	switch (chosenCard) { 
  				case 0:		System.out.println("\nChosen card: Card 1" + Arrays.toString(card1));		tempPlayerCard = card1;		break;
  				case 1: 	System.out.println("\nChosen card: Card 2" + Arrays.toString(card2));		tempPlayerCard = card2;		break;
  				case 2: 	System.out.println("\nChosen card: Card 3" + Arrays.toString(card3));		tempPlayerCard = card3;		break;
				case 3: 	System.out.println("\nChosen card: Card 4" + Arrays.toString(card4));		tempPlayerCard = card4;		break;
  				case 4: 	System.out.println("\nChosen card: Card 5" + Arrays.toString(card5));		tempPlayerCard = card5;		break;
  				case 5:		System.out.println("\nChosen card: Card 6" + Arrays.toString(card6));		tempPlayerCard = card6;		break;
  				case 6:		System.out.println("\nChosen card: Card 7" + Arrays.toString(card7));		tempPlayerCard = card7;		break;
  				case 7:		System.out.println("\nChosen card: Card 8" + Arrays.toString(card8));		tempPlayerCard = card8;		break;
  				case 8:		System.out.println("\nChosen card: Card 9" + Arrays.toString(card9));		tempPlayerCard = card9;		break; 
  				case 9:		System.out.println("\nChosen card: Card 10" + Arrays.toString(card10));		tempPlayerCard = card10;	break;
  				case 10:	System.out.println("\nChosen card: Card 11" + Arrays.toString(card11));		tempPlayerCard = card11;	break;
  				case 11: 	System.out.println("\nChosen card: Card 12" + Arrays.toString(card12));		tempPlayerCard = card12;	break;
  				case 12: 	System.out.println("\nChosen card: Card 13" + Arrays.toString(card13));		tempPlayerCard = card13;	break;
  				case 13: 	System.out.println("\nChosen card: Card 14" + Arrays.toString(card14));		tempPlayerCard = card14;	break;
  				case 14: 	System.out.println("\nChosen card: Card 15" + Arrays.toString(card15));		tempPlayerCard = card15;	break;
  				case 15: 	System.out.println("\nChosen card: Card 16" + Arrays.toString(card16));		tempPlayerCard = card16;	break;
  				case 16: 	System.out.println("\nChosen card: Card 17" + Arrays.toString(card17));		tempPlayerCard = card17;	break;
  				case 17: 	System.out.println("\nChosen card: Card 18" + Arrays.toString(card18));		tempPlayerCard = card18;	break;
  				case 18:	System.out.println("\nChosen card: Card 19" + Arrays.toString(card19));		tempPlayerCard = card19;	break;
  				case 19:	System.out.println("\nChosen card: Card 20" + Arrays.toString(card20));		tempPlayerCard = card20;	break;
  				case 20:	System.out.println("\nChosen card: Card 21" + Arrays.toString(card21));		tempPlayerCard = card21;	break;
  				case 21:	System.out.println("\nChosen card: Card 22" + Arrays.toString(card22));		tempPlayerCard = card22;	break;
  				case 22:	System.out.println("\nChosen card: Card 23" + Arrays.toString(card23));		tempPlayerCard = card23;	break;
  				case 23:	System.out.println("\nChosen card: Card 24" + Arrays.toString(card24));		tempPlayerCard = card24;	break;
  				case 24:	System.out.println("\nChosen card: Card 25" + Arrays.toString(card25));		tempPlayerCard = card25;	break;
  				case 25:	System.out.println("\nChosen card: Card 26" + Arrays.toString(card26));		tempPlayerCard = card26;	break;
  				case 26:	System.out.println("\nChosen card: Card 27" + Arrays.toString(card27));		tempPlayerCard = card27;	break;
  				case 27:	System.out.println("\nChosen card: Card 28" + Arrays.toString(card28));		tempPlayerCard = card28;	break;
  				case 28:	System.out.println("\nChosen card: Card 29" + Arrays.toString(card29));		tempPlayerCard = card29;	break;
  				case 29:	System.out.println("\nChosen card: Card 30" + Arrays.toString(card30));		tempPlayerCard = card30;	break;
			}        
				 		
        	enemyChoice = (int)(Math.random() * enemyHand.length);
        	gameTxtEnemyChose.setText(String.valueOf(enemyHand[enemyChoice]));
        	choiceEnemy = Integer.parseInt(gameTxtEnemyChose.getText());
        	gameLblAICard.setIcon(playcard[choiceEnemy]);
        	stackCtr--;
        	
        	switch (choiceEnemy) {
        		case 0:		System.out.println("\nEnemy chosen card: Card 1" + Arrays.toString(card1));		tempEnemyCard = card1;		break;
  				case 1: 	System.out.println("\nEnemy chosen card: Card 2" + Arrays.toString(card2));		tempEnemyCard = card2;		break;
  				case 2: 	System.out.println("\nEnemy chosen card: Card 3" + Arrays.toString(card3));		tempEnemyCard = card3;		break;
				case 3: 	System.out.println("\nEnemy chosen card: Card 4" + Arrays.toString(card4));		tempEnemyCard = card4;		break;
  				case 4: 	System.out.println("\nEnemy chosen card: Card 5" + Arrays.toString(card5));		tempEnemyCard = card5;		break;
  				case 5:		System.out.println("\nEnemy chosen card: Card 6" + Arrays.toString(card6));		tempEnemyCard = card6;		break;
  				case 6:		System.out.println("\nEnemy chosen card: Card 7" + Arrays.toString(card7));		tempEnemyCard = card7;		break;
  				case 7:		System.out.println("\nEnemy chosen card: Card 8" + Arrays.toString(card8));		tempEnemyCard = card8;		break;
  				case 8:		System.out.println("\nEnemy chosen card: Card 9" + Arrays.toString(card9));		tempEnemyCard = card9;		break; 
  				case 9:		System.out.println("\nEnemy chosen card: Card 10" + Arrays.toString(card10));	tempEnemyCard = card10;		break;
  				case 10:	System.out.println("\nEnemy chosen card: Card 11" + Arrays.toString(card11));	tempEnemyCard = card11;		break;
  				case 11: 	System.out.println("\nEnemy chosen card: Card 12" + Arrays.toString(card12));	tempEnemyCard = card12;		break;
  				case 12: 	System.out.println("\nEnemy chosen card: Card 13" + Arrays.toString(card13));	tempEnemyCard = card13;		break;
  				case 13: 	System.out.println("\nEnemy chosen card: Card 14" + Arrays.toString(card14));	tempEnemyCard = card14;		break;
  				case 14: 	System.out.println("\nEnemy chosen card: Card 15" + Arrays.toString(card15));	tempEnemyCard = card15;		break;
  				case 15: 	System.out.println("\nEnemy chosen card: Card 16" + Arrays.toString(card16));	tempEnemyCard = card16;		break;
  				case 16: 	System.out.println("\nEnemy chosen card: Card 17" + Arrays.toString(card17));	tempEnemyCard = card17;		break;
  				case 17: 	System.out.println("\nEnemy chosen card: Card 18" + Arrays.toString(card18));	tempEnemyCard = card18;		break;
  				case 18:	System.out.println("\nEnemy chosen card: Card 19" + Arrays.toString(card19));	tempEnemyCard = card19;		break;
  				case 19:	System.out.println("\nEnemy chosen card: Card 20" + Arrays.toString(card20));	tempEnemyCard = card20;		break;
  				case 20:	System.out.println("\nEnemy chosen card: Card 21" + Arrays.toString(card21));	tempEnemyCard = card21;		break;
  				case 21:	System.out.println("\nEnemy chosen card: Card 22" + Arrays.toString(card22));	tempEnemyCard = card22;		break;
  				case 22:	System.out.println("\nEnemy chosen card: Card 23" + Arrays.toString(card23));	tempEnemyCard = card23;		break;
  				case 23:	System.out.println("\nEnemy chosen card: Card 24" + Arrays.toString(card24));	tempEnemyCard = card24;		break;
  				case 24:	System.out.println("\nEnemy chosen card: Card 25" + Arrays.toString(card25));	tempEnemyCard = card25;		break;
  				case 25:	System.out.println("\nEnemy chosen card: Card 26" + Arrays.toString(card26));	tempEnemyCard = card26;		break;
  				case 26:	System.out.println("\nEnemy chosen card: Card 27" + Arrays.toString(card27));	tempEnemyCard = card27;		break;
  				case 27:	System.out.println("\nEnemy chosen card: Card 28" + Arrays.toString(card28));	tempEnemyCard = card28;		break;
  				case 28:	System.out.println("\nEnemy chosen card: Card 29" + Arrays.toString(card29));	tempEnemyCard = card29;		break;
  				case 29:	System.out.println("\nEnemy chosen card: Card 30" + Arrays.toString(card30));	tempEnemyCard = card30;		break;
        		}
        		
			gameLblDeckCtr.setFont(fntNinja);
			gameLblDeckCtr.setText(String.valueOf(stackCtr));
			//check who wins by type, and then by power
			if (tempPlayerCard[1] == 1 && tempEnemyCard[1] == 3) //player rock & enemy scissors
    		{
    			System.out.println("\nPlayer wins by type!");
    			gameLblDeclare.setIcon(playerType);
    			playerRoundWin = true;
    			
    			//switch label to icon of winning card; 3 label difference in position; if-else in case checks what color to sub
    			switch (playerRockWinCtr) {
    				case 1:		if (tempPlayerCard[2] == 1){
    								gameLblPlayerWin1.setIcon(winIcon[0]);	} //rock red 
    							else if	(tempPlayerCard[2] == 2){
    								gameLblPlayerWin1.setIcon(winIcon[1]);	} //rock blue
    							else if (tempPlayerCard[2] == 3){
    								gameLblPlayerWin1.setIcon(winIcon[2]);	} //rock yellow
    							else if (tempPlayerCard[2] == 4){			  //rock green
    								gameLblPlayerWin1.setIcon(winIcon[3]);	}		break;
    								
    				case 4:		if (tempPlayerCard[2] == 1){
    								gameLblPlayerWin4.setIcon(winIcon[0]);	}
    							else if	(tempPlayerCard[2] == 2){
    								gameLblPlayerWin4.setIcon(winIcon[1]);	}
    							else if (tempPlayerCard[2] == 3){
    								gameLblPlayerWin4.setIcon(winIcon[2]);	}
    							else if (tempPlayerCard[2] == 4){
    								gameLblPlayerWin4.setIcon(winIcon[3]);	}		break;
    								
    				case 7:		if (tempPlayerCard[2] == 1){
    								gameLblPlayerWin7.setIcon(winIcon[0]);	}
    							else if	(tempPlayerCard[2] == 2){
    								gameLblPlayerWin7.setIcon(winIcon[1]);	}
    							else if (tempPlayerCard[2] == 3){
    								gameLblPlayerWin7.setIcon(winIcon[2]);	}
    							else if (tempPlayerCard[2] == 4){
    								gameLblPlayerWin7.setIcon(winIcon[3]);	}		break;
    								
    				case 10:	if (tempPlayerCard[2] == 1){
    								gameLblPlayerWin10.setIcon(winIcon[0]);	}
    							else if	(tempPlayerCard[2] == 2){
    								gameLblPlayerWin10.setIcon(winIcon[1]);	}
    							else if (tempPlayerCard[2] == 3){
    								gameLblPlayerWin10.setIcon(winIcon[2]);	}
    							else if (tempPlayerCard[2] == 4){
    								gameLblPlayerWin10.setIcon(winIcon[3]);	}		break;
    								
    				case 13:	if (tempPlayerCard[2] == 1){
    								gameLblPlayerWin13.setIcon(winIcon[0]);	}
    							else if	(tempPlayerCard[2] == 2){
    								gameLblPlayerWin13.setIcon(winIcon[1]);	}
    							else if (tempPlayerCard[2] == 3){
    								gameLblPlayerWin13.setIcon(winIcon[2]);	}
    							else if (tempPlayerCard[2] == 4){
    								gameLblPlayerWin13.setIcon(winIcon[3]);	}		break;
    			}
    			
    			//add 3 so it will skip the other 3 labels
    			playerRockWinCtr = playerRockWinCtr + 3;
    		}
    
    		else if (tempPlayerCard[1] == 1 && tempEnemyCard[1] == 2) //player rock && enemy paper
    		{   
    			System.out.println("\nEnemy wins by type!");
    			gameLblDeclare.setIcon(enemyType);
    			enemyRoundWin = true;
    			
    			switch (enemyPaperWinCtr) {
    				case 2:		if (tempEnemyCard[2] == 1){
    								gameLblBotWin2.setIcon(winIcon[4]);	} //paper red 
    							else if	(tempEnemyCard[2] == 2){
    								gameLblBotWin2.setIcon(winIcon[5]);	} //paper blue
    							else if (tempEnemyCard[2] == 3){
    								gameLblBotWin2.setIcon(winIcon[6]);	} //paper yellow
    							else if (tempEnemyCard[2] == 4){			  //paper green
    								gameLblBotWin2.setIcon(winIcon[7]);	}		break;
    								
    				case 5:		if (tempEnemyCard[2] == 1){
    								gameLblBotWin5.setIcon(winIcon[4]);	}  
    							else if	(tempEnemyCard[2] == 2){
    								gameLblBotWin5.setIcon(winIcon[5]);	} 
    							else if (tempEnemyCard[2] == 3){
    								gameLblBotWin5.setIcon(winIcon[6]);	} 
    							else if (tempEnemyCard[2] == 4){			  
    								gameLblBotWin5.setIcon(winIcon[7]);	}		break;
    								
    				case 8:		if (tempEnemyCard[2] == 1){
    								gameLblBotWin8.setIcon(winIcon[4]);	}  
    							else if	(tempEnemyCard[2] == 2){
    								gameLblBotWin8.setIcon(winIcon[5]);	} 
    							else if (tempEnemyCard[2] == 3){
    								gameLblBotWin8.setIcon(winIcon[6]);	} 
    							else if (tempEnemyCard[2] == 4){			  
    								gameLblBotWin8.setIcon(winIcon[7]);	}		break;
    								
    				case 11:	if (tempEnemyCard[2] == 1){
    								gameLblBotWin11.setIcon(winIcon[4]);	} 
    							else if	(tempEnemyCard[2] == 2){
    								gameLblBotWin11.setIcon(winIcon[5]);	} 
    							else if (tempEnemyCard[2] == 3){
    								gameLblBotWin11.setIcon(winIcon[6]);	} 
    							else if (tempEnemyCard[2] == 4){			  
    								gameLblBotWin11.setIcon(winIcon[7]);	}		break;
    								
    				case 14:	if (tempEnemyCard[2] == 1){
    								gameLblBotWin14.setIcon(winIcon[4]);	} 
    							else if	(tempEnemyCard[2] == 2){
    								gameLblBotWin14.setIcon(winIcon[5]);	} 
    							else if (tempEnemyCard[2] == 3){
    								gameLblBotWin14.setIcon(winIcon[6]);	} 
    							else if (tempEnemyCard[2] == 4){			  
    								gameLblBotWin14.setIcon(winIcon[7]);	}		break;								
    			}
    			
    			enemyPaperWinCtr = enemyPaperWinCtr + 3;
    		}	
    	
			else if (tempPlayerCard[1] == 1 && tempEnemyCard[1] == 1) //both rock
    		{
    			if (tempPlayerCard[0] > tempEnemyCard[0])
    			{    	
    				System.out.println("\nPlayer wins by power!");
    				gameLblDeclare.setIcon(playerPower);
    				playerRoundWin = true;
    				
    				switch (playerRockWinCtr) {
    					case 1:		if (tempPlayerCard[2] == 1){
    									gameLblPlayerWin1.setIcon(winIcon[0]);	}
    								else if	(tempPlayerCard[2] == 2){
    									gameLblPlayerWin1.setIcon(winIcon[1]);	}
    								else if (tempPlayerCard[2] == 3){
    									gameLblPlayerWin1.setIcon(winIcon[2]);	}
    								else if (tempPlayerCard[2] == 4){
    									gameLblPlayerWin1.setIcon(winIcon[3]);	}		break;
    								
    					case 4:		if (tempPlayerCard[2] == 1){
    									gameLblPlayerWin4.setIcon(winIcon[0]);	}
    								else if	(tempPlayerCard[2] == 2){
    									gameLblPlayerWin4.setIcon(winIcon[1]);	}
    								else if (tempPlayerCard[2] == 3){
    									gameLblPlayerWin4.setIcon(winIcon[2]);	}
    								else if (tempPlayerCard[2] == 4){
    									gameLblPlayerWin4.setIcon(winIcon[3]);	}		break;
    								
    					case 7:		if (tempPlayerCard[2] == 1){
    									gameLblPlayerWin7.setIcon(winIcon[0]);	}
    								else if	(tempPlayerCard[2] == 2){
    									gameLblPlayerWin7.setIcon(winIcon[1]);	}
    								else if (tempPlayerCard[2] == 3){
    									gameLblPlayerWin7.setIcon(winIcon[2]);	}
    								else if (tempPlayerCard[2] == 4){
    									gameLblPlayerWin7.setIcon(winIcon[3]);	}		break;
    								
    					case 10:	if (tempPlayerCard[2] == 1){
    									gameLblPlayerWin10.setIcon(winIcon[0]);	}
    								else if	(tempPlayerCard[2] == 2){
    									gameLblPlayerWin10.setIcon(winIcon[1]);	}
    								else if (tempPlayerCard[2] == 3){
    									gameLblPlayerWin10.setIcon(winIcon[2]);	}
    								else if (tempPlayerCard[2] == 4){
    									gameLblPlayerWin10.setIcon(winIcon[3]);	}		break;
    								
    					case 13:	if (tempPlayerCard[2] == 1){
    									gameLblPlayerWin13.setIcon(winIcon[0]);	}
    								else if	(tempPlayerCard[2] == 2){
    									gameLblPlayerWin13.setIcon(winIcon[1]);	}
    								else if (tempPlayerCard[2] == 3){
    									gameLblPlayerWin13.setIcon(winIcon[2]);	}
    								else if (tempPlayerCard[2] == 4){
    									gameLblPlayerWin13.setIcon(winIcon[3]);	}		break;
    				}
    			
    				playerRockWinCtr = playerRockWinCtr + 3;
    			}
    		
    			else if	(tempPlayerCard[0] < tempEnemyCard[0])
    			{	    	
    				System.out.println("\nEnemy wins by power!");
    				gameLblDeclare.setIcon(enemyPower);
    				enemyRoundWin = true;
    				
    				switch (enemyRockWinCtr) {
	    				case 1:		if (tempEnemyCard[2] == 1){
	    								gameLblBotWin1.setIcon(winIcon[0]);	} //rock red 
	    							else if	(tempEnemyCard[2] == 2){
	    								gameLblBotWin1.setIcon(winIcon[1]);	} //rock blue
	    							else if (tempEnemyCard[2] == 3){
	    								gameLblBotWin1.setIcon(winIcon[2]);	} //rock yellow
	    							else if (tempEnemyCard[2] == 4){			  //rock green
	    								gameLblBotWin1.setIcon(winIcon[3]);	}		break;
	    								
	    				case 4:		if (tempEnemyCard[2] == 1){
	    								gameLblBotWin4.setIcon(winIcon[0]);	}  
	    							else if	(tempEnemyCard[2] == 2){
	    								gameLblBotWin4.setIcon(winIcon[1]);	} 
	    							else if (tempEnemyCard[2] == 3){
	    								gameLblBotWin4.setIcon(winIcon[2]);	} 
	    							else if (tempEnemyCard[2] == 4){			  
	    								gameLblBotWin4.setIcon(winIcon[3]);	}		break;
	    								
	    				case 7:		if (tempEnemyCard[2] == 1){
	    								gameLblBotWin7.setIcon(winIcon[0]);	}  
	    							else if	(tempEnemyCard[2] == 2){
	    								gameLblBotWin7.setIcon(winIcon[1]);	} 
	    							else if (tempEnemyCard[2] == 3){
	    								gameLblBotWin7.setIcon(winIcon[2]);	} 
	    							else if (tempEnemyCard[2] == 4){			  
	    								gameLblBotWin7.setIcon(winIcon[3]);	}		break;
	    								
	    				case 10:	if (tempEnemyCard[2] == 1){
	    								gameLblBotWin10.setIcon(winIcon[0]);	} 
	    							else if	(tempEnemyCard[2] == 2){
	    								gameLblBotWin10.setIcon(winIcon[1]);	} 
	    							else if (tempEnemyCard[2] == 3){
	    								gameLblBotWin10.setIcon(winIcon[2]);	} 
	    							else if (tempEnemyCard[2] == 4){			  
	    								gameLblBotWin10.setIcon(winIcon[3]);	}		break;
	    								
	    				case 13:	if (tempEnemyCard[2] == 1){
	    								gameLblBotWin13.setIcon(winIcon[0]);	} 
	    							else if	(tempEnemyCard[2] == 2){
	    								gameLblBotWin13.setIcon(winIcon[1]);	} 
	    							else if (tempEnemyCard[2] == 3){
	    								gameLblBotWin13.setIcon(winIcon[2]);	} 
	    							else if (tempEnemyCard[2] == 4){			  
	    								gameLblBotWin13.setIcon(winIcon[3]);	}		break;								
	    			}
	    			
	    			enemyRockWinCtr = enemyRockWinCtr + 3;
  				}
    		
    			else if (tempPlayerCard[0] == tempEnemyCard[0])
    			{
    				System.out.println("\nDRAW BY POWER!");
    				gameLblDeclare.setIcon(drawPower);
    			}	
    					
    		}
    	
    		else if (tempPlayerCard[1] == 2 && tempEnemyCard[1] == 1) //player paper && enemy rock
    		{
    			System.out.println("\nPlayer wins by type!");
    			gameLblDeclare.setIcon(playerType);
    			playerRoundWin = true;
    			
    			switch (playerPaperWinCtr) {
    				case 2:		if (tempPlayerCard[2] == 1){
    								gameLblPlayerWin2.setIcon(winIcon[4]);	} //paper red 
    							else if	(tempPlayerCard[2] == 2){
    								gameLblPlayerWin2.setIcon(winIcon[5]);	} //paper blue
    							else if (tempPlayerCard[2] == 3){
    								gameLblPlayerWin2.setIcon(winIcon[6]);	} //paper yellow
    							else if (tempPlayerCard[2] == 4){			  //paper green
    								gameLblPlayerWin2.setIcon(winIcon[7]);	}		break;
    								
    				case 5:		if (tempPlayerCard[2] == 1){
    								gameLblPlayerWin5.setIcon(winIcon[4]);	}
    							else if	(tempPlayerCard[2] == 2){
    								gameLblPlayerWin5.setIcon(winIcon[5]);	}
    							else if (tempPlayerCard[2] == 3){
    								gameLblPlayerWin5.setIcon(winIcon[6]);	}
    							else if (tempPlayerCard[2] == 4){
    								gameLblPlayerWin5.setIcon(winIcon[7]);	}		break;
    								
    				case 8:		if (tempPlayerCard[2] == 1){
    								gameLblPlayerWin8.setIcon(winIcon[4]);	}
    							else if	(tempPlayerCard[2] == 2){
    								gameLblPlayerWin8.setIcon(winIcon[5]);	}
    							else if (tempPlayerCard[2] == 3){
    								gameLblPlayerWin8.setIcon(winIcon[6]);	}
    							else if (tempPlayerCard[2] == 4){
    								gameLblPlayerWin8.setIcon(winIcon[7]);	}		break;
    								
    				case 11:	if (tempPlayerCard[2] == 1){
    								gameLblPlayerWin11.setIcon(winIcon[4]);	}
    							else if	(tempPlayerCard[2] == 2){
    								gameLblPlayerWin11.setIcon(winIcon[5]);	}
    							else if (tempPlayerCard[2] == 3){
    								gameLblPlayerWin11.setIcon(winIcon[6]);	}
    							else if (tempPlayerCard[2] == 4){
    								gameLblPlayerWin11.setIcon(winIcon[7]);	}		break;
    								
    				case 14:	if (tempPlayerCard[2] == 1){
    								gameLblPlayerWin14.setIcon(winIcon[4]);	}
    							else if	(tempPlayerCard[2] == 2){
    								gameLblPlayerWin14.setIcon(winIcon[5]);	}
    							else if (tempPlayerCard[2] == 3){
    								gameLblPlayerWin14.setIcon(winIcon[6]);	}
    							else if (tempPlayerCard[2] == 4){
    								gameLblPlayerWin14.setIcon(winIcon[7]);	}		break;
    			}
    			
    			playerPaperWinCtr = playerPaperWinCtr + 3;
    		}	
    
    		else if (tempPlayerCard[1] == 2 && tempEnemyCard[1] == 3) //player paper && enemy scissors
    		{   
    			System.out.println("\nEnemy wins by type!");
    			gameLblDeclare.setIcon(enemyType);
    			enemyRoundWin = true;
    			
    			switch (enemyScissorsWinCtr) {
    				case 3:		if (tempEnemyCard[2] == 1){
    								gameLblBotWin3.setIcon(winIcon[8]);	} //scissors red 
    							else if	(tempEnemyCard[2] == 2){
    								gameLblBotWin3.setIcon(winIcon[9]);	} //scissors blue
    							else if (tempEnemyCard[2] == 3){
    								gameLblBotWin3.setIcon(winIcon[10]);	} //scissors yellow
    							else if (tempEnemyCard[2] == 4){			  //scissors green
    								gameLblBotWin3.setIcon(winIcon[11]);	}		break;
    								
    				case 6:		if (tempEnemyCard[2] == 1){
    								gameLblBotWin6.setIcon(winIcon[8]);	}  
    							else if	(tempEnemyCard[2] == 2){
    								gameLblBotWin6.setIcon(winIcon[9]);	} 
    							else if (tempEnemyCard[2] == 3){
    								gameLblBotWin6.setIcon(winIcon[10]);	} 
    							else if (tempEnemyCard[2] == 4){			  
    								gameLblBotWin6.setIcon(winIcon[11]);	}		break;
    								
    				case 9:		if (tempEnemyCard[2] == 1){
    								gameLblBotWin9.setIcon(winIcon[8]);	}  
    							else if	(tempEnemyCard[2] == 2){
    								gameLblBotWin9.setIcon(winIcon[9]);	} 
    							else if (tempEnemyCard[2] == 3){
    								gameLblBotWin9.setIcon(winIcon[10]);	} 
    							else if (tempEnemyCard[2] == 4){			  
    								gameLblBotWin9.setIcon(winIcon[11]);	}		break;
    								
    				case 12:	if (tempEnemyCard[2] == 1){
    								gameLblBotWin12.setIcon(winIcon[8]);	} 
    							else if	(tempEnemyCard[2] == 2){
    								gameLblBotWin12.setIcon(winIcon[9]);	} 
    							else if (tempEnemyCard[2] == 3){
    								gameLblBotWin12.setIcon(winIcon[10]);	} 
    							else if (tempEnemyCard[2] == 4){			  
    								gameLblBotWin12.setIcon(winIcon[11]);	}		break;
    								
    				case 15:	if (tempEnemyCard[2] == 1){
    								gameLblBotWin15.setIcon(winIcon[8]);	} 
    							else if	(tempEnemyCard[2] == 2){
    								gameLblBotWin15.setIcon(winIcon[9]);	} 
    							else if (tempEnemyCard[2] == 3){
    								gameLblBotWin15.setIcon(winIcon[10]);	} 
    							else if (tempEnemyCard[2] == 4){			  
    								gameLblBotWin15.setIcon(winIcon[11]);	}		break;								
    			}
    			
    			enemyScissorsWinCtr = enemyScissorsWinCtr + 3;
    		}
    	
    		else if (tempPlayerCard[1] == 2 && tempEnemyCard[1] == 2) //both paper
    		{
    			if (tempPlayerCard[0] > tempEnemyCard[0])
    			{    	
    				System.out.println("\nPlayer wins by power!");
    				gameLblDeclare.setIcon(playerPower);
    				playerRoundWin = true;
    				
    				switch (playerPaperWinCtr) {
    					case 2:		if (tempPlayerCard[2] == 1){
    									gameLblPlayerWin2.setIcon(winIcon[4]);	} //paper red 
    								else if	(tempPlayerCard[2] == 2){
    									gameLblPlayerWin2.setIcon(winIcon[5]);	} //paper blue
    								else if (tempPlayerCard[2] == 3){
    									gameLblPlayerWin2.setIcon(winIcon[6]);	} //paper yellow
    								else if (tempPlayerCard[2] == 4){			  //paper green
    									gameLblPlayerWin2.setIcon(winIcon[7]);	}		break;
    								
    					case 5:		if (tempPlayerCard[2] == 1){
    									gameLblPlayerWin5.setIcon(winIcon[4]);	}
    								else if	(tempPlayerCard[2] == 2){
    									gameLblPlayerWin5.setIcon(winIcon[5]);	}
    								else if (tempPlayerCard[2] == 3){
    									gameLblPlayerWin5.setIcon(winIcon[6]);	}
    								else if (tempPlayerCard[2] == 4){
    									gameLblPlayerWin5.setIcon(winIcon[7]);	}		break;
    								
    					case 8:		if (tempPlayerCard[2] == 1){
    									gameLblPlayerWin8.setIcon(winIcon[4]);	}
    								else if	(tempPlayerCard[2] == 2){
    									gameLblPlayerWin8.setIcon(winIcon[5]);	}
    								else if (tempPlayerCard[2] == 3){
    									gameLblPlayerWin8.setIcon(winIcon[6]);	}
    								else if (tempPlayerCard[2] == 4){
    									gameLblPlayerWin8.setIcon(winIcon[7]);	}		break;
    								
    					case 11:	if (tempPlayerCard[2] == 1){
    									gameLblPlayerWin11.setIcon(winIcon[4]);	}
    								else if	(tempPlayerCard[2] == 2){
    									gameLblPlayerWin11.setIcon(winIcon[5]);	}
    								else if (tempPlayerCard[2] == 3){
    									gameLblPlayerWin11.setIcon(winIcon[6]);	}
    								else if (tempPlayerCard[2] == 4){
    									gameLblPlayerWin11.setIcon(winIcon[7]);	}		break;
    								
    					case 14:	if (tempPlayerCard[2] == 1){
    									gameLblPlayerWin14.setIcon(winIcon[4]);	}
    								else if	(tempPlayerCard[2] == 2){
    									gameLblPlayerWin14.setIcon(winIcon[5]);	}
    								else if (tempPlayerCard[2] == 3){
    									gameLblPlayerWin14.setIcon(winIcon[6]);	}
    								else if (tempPlayerCard[2] == 4){
    									gameLblPlayerWin14.setIcon(winIcon[7]);	}		break;
    				}
    			
    				playerPaperWinCtr = playerPaperWinCtr + 3;
    			}
    		
    			else if	(tempPlayerCard[0] < tempEnemyCard[0])
    			{    	
    				System.out.println("\nEnemy wins by power!");
    				gameLblDeclare.setIcon(enemyPower);
    				enemyRoundWin = true;
    				
    				switch (enemyPaperWinCtr) {
    					case 2:		if (tempEnemyCard[2] == 1){
    									gameLblBotWin2.setIcon(winIcon[4]);	} //paper red 
    								else if	(tempEnemyCard[2] == 2){
    									gameLblBotWin2.setIcon(winIcon[5]);	} //paper blue
    								else if (tempEnemyCard[2] == 3){
    									gameLblBotWin2.setIcon(winIcon[6]);	} //paper yellow
    								else if (tempEnemyCard[2] == 4){			  //paper green
    									gameLblBotWin2.setIcon(winIcon[7]);	}		break;
    								
    					case 5:		if (tempEnemyCard[2] == 1){
    									gameLblBotWin5.setIcon(winIcon[4]);	}  
    								else if	(tempEnemyCard[2] == 2){
    									gameLblBotWin5.setIcon(winIcon[5]);	} 
    								else if (tempEnemyCard[2] == 3){
    									gameLblBotWin5.setIcon(winIcon[6]);	} 
    								else if (tempEnemyCard[2] == 4){			  
    									gameLblBotWin5.setIcon(winIcon[7]);	}		break;
    								
    					case 8:		if (tempEnemyCard[2] == 1){
    									gameLblBotWin8.setIcon(winIcon[4]);	}  
    								else if	(tempEnemyCard[2] == 2){
    									gameLblBotWin8.setIcon(winIcon[5]);	} 
    								else if (tempEnemyCard[2] == 3){
    									gameLblBotWin8.setIcon(winIcon[6]);	} 
    								else if (tempEnemyCard[2] == 4){			  
    									gameLblBotWin8.setIcon(winIcon[7]);	}		break;
    								
    					case 11:	if (tempEnemyCard[2] == 1){
    									gameLblBotWin11.setIcon(winIcon[4]);	} 
    								else if	(tempEnemyCard[2] == 2){
    									gameLblBotWin11.setIcon(winIcon[5]);	} 
    								else if (tempEnemyCard[2] == 3){
    									gameLblBotWin11.setIcon(winIcon[6]);	} 
    								else if (tempEnemyCard[2] == 4){			  
    									gameLblBotWin11.setIcon(winIcon[7]);	}		break;
    								
    					case 14:	if (tempEnemyCard[2] == 1){
    									gameLblBotWin14.setIcon(winIcon[4]);	} 
    								else if	(tempEnemyCard[2] == 2){
    									gameLblBotWin14.setIcon(winIcon[5]);	} 
    								else if (tempEnemyCard[2] == 3){
    									gameLblBotWin14.setIcon(winIcon[6]);	} 
    								else if (tempEnemyCard[2] == 4){			  
    									gameLblBotWin14.setIcon(winIcon[7]);	}		break;								
    				}
    			
    				enemyPaperWinCtr = enemyPaperWinCtr + 3;
  		  		}
    		
    		else if (tempPlayerCard[0] == tempEnemyCard[0])
    		{
    			System.out.println("\nDRAW BY POWER!");
    			gameLblDeclare.setIcon(drawPower);
    		}
    		}
    
    		else if (tempPlayerCard[1] == 3 && tempEnemyCard[1] == 2) //player scissors && enemy paper
   			{
    			System.out.println("\nPlayer wins by type!");
    			gameLblDeclare.setIcon(playerType);
    			playerRoundWin = true;
    			
    			switch (playerScissorsWinCtr) {
    				case 3:		if (tempPlayerCard[2] == 1){
    								gameLblPlayerWin3.setIcon(winIcon[8]);	} //scissors red 
    							else if	(tempPlayerCard[2] == 2){
    								gameLblPlayerWin3.setIcon(winIcon[9]);	} //scissors blue
    							else if (tempPlayerCard[2] == 3){
    								gameLblPlayerWin3.setIcon(winIcon[10]);	} //scissors yellow
    							else if (tempPlayerCard[2] == 4){			  //scissors green
    								gameLblPlayerWin3.setIcon(winIcon[11]);	}		break;
    								
    				case 6:		if (tempPlayerCard[2] == 1){
    								gameLblPlayerWin6.setIcon(winIcon[8]);	}
    							else if	(tempPlayerCard[2] == 2){
    								gameLblPlayerWin6.setIcon(winIcon[9]);	}
    							else if (tempPlayerCard[2] == 3){
    								gameLblPlayerWin6.setIcon(winIcon[10]);	}
    							else if (tempPlayerCard[2] == 4){
    								gameLblPlayerWin6.setIcon(winIcon[11]);	}		break;
    								
    				case 9:		if (tempPlayerCard[2] == 1){
    								gameLblPlayerWin9.setIcon(winIcon[8]);	}
    							else if	(tempPlayerCard[2] == 2){
    								gameLblPlayerWin9.setIcon(winIcon[9]);	}
    							else if (tempPlayerCard[2] == 3){
    								gameLblPlayerWin9.setIcon(winIcon[10]);	}
    							else if (tempPlayerCard[2] == 4){
    								gameLblPlayerWin9.setIcon(winIcon[11]);	}		break;
    								
    				case 12:	if (tempPlayerCard[2] == 1){
    								gameLblPlayerWin12.setIcon(winIcon[8]);	}
    							else if	(tempPlayerCard[2] == 2){
    								gameLblPlayerWin12.setIcon(winIcon[9]);	}
    							else if (tempPlayerCard[2] == 3){
    								gameLblPlayerWin12.setIcon(winIcon[10]);	}
    							else if (tempPlayerCard[2] == 4){
    								gameLblPlayerWin12.setIcon(winIcon[11]);	}		break;
    								
    				case 15:	if (tempPlayerCard[2] == 1){
    								gameLblPlayerWin15.setIcon(winIcon[8]);	}
    							else if	(tempPlayerCard[2] == 2){
    								gameLblPlayerWin15.setIcon(winIcon[9]);	}
    							else if (tempPlayerCard[2] == 3){
    								gameLblPlayerWin15.setIcon(winIcon[10]);	}
    							else if (tempPlayerCard[2] == 4){
    								gameLblPlayerWin15.setIcon(winIcon[11]);	}		break;
    			}
    			
    			playerScissorsWinCtr = playerScissorsWinCtr + 3;
    		}
   		
   			else if (tempPlayerCard[1] == 3 && tempEnemyCard[1] == 1) //player scissors && enemy rock
    		{   
    			System.out.println("\nEnemy wins by type!");
    			gameLblDeclare.setIcon(enemyType);
    			enemyRoundWin = true;
    			
    			switch (enemyRockWinCtr) {
    				case 1:		if (tempEnemyCard[2] == 1){
    								gameLblBotWin1.setIcon(winIcon[0]);	} //rock red 
    							else if	(tempEnemyCard[2] == 2){
    								gameLblBotWin1.setIcon(winIcon[1]);	} //rock blue
    							else if (tempEnemyCard[2] == 3){
    								gameLblBotWin1.setIcon(winIcon[2]);	} //rock yellow
    							else if (tempEnemyCard[2] == 4){			  //rock green
    								gameLblBotWin1.setIcon(winIcon[3]);	}		break;
    								
    				case 4:		if (tempEnemyCard[2] == 1){
    								gameLblBotWin4.setIcon(winIcon[0]);	} //rock red 
    							else if	(tempEnemyCard[2] == 2){
    								gameLblBotWin4.setIcon(winIcon[1]);	} //rock blue
    							else if (tempEnemyCard[2] == 3){
    								gameLblBotWin4.setIcon(winIcon[2]);	} //rock yellow
    							else if (tempEnemyCard[2] == 4){			  //rock green
    								gameLblBotWin4.setIcon(winIcon[3]);	}		break;
    								
    				case 7:		if (tempEnemyCard[2] == 1){
    								gameLblBotWin7.setIcon(winIcon[0]);	} //rock red 
    							else if	(tempEnemyCard[2] == 2){
    								gameLblBotWin7.setIcon(winIcon[1]);	} //rock blue
    							else if (tempEnemyCard[2] == 3){
    								gameLblBotWin7.setIcon(winIcon[2]);	} //rock yellow
    							else if (tempEnemyCard[2] == 4){			  //rock green
    								gameLblBotWin7.setIcon(winIcon[3]);	}		break;
    								
    				case 10:	if (tempEnemyCard[2] == 1){
    								gameLblBotWin10.setIcon(winIcon[0]);	} //rock red 
    							else if	(tempEnemyCard[2] == 2){
    								gameLblBotWin10.setIcon(winIcon[1]);	} //rock blue
    							else if (tempEnemyCard[2] == 3){
    								gameLblBotWin10.setIcon(winIcon[2]);	} //rock yellow
    							else if (tempEnemyCard[2] == 4){			  //rock green
    								gameLblBotWin10.setIcon(winIcon[3]);	}		break;
    								
    				case 13:	if (tempEnemyCard[2] == 1){
    								gameLblBotWin13.setIcon(winIcon[0]);	} //rock red 
    							else if	(tempEnemyCard[2] == 2){
    								gameLblBotWin13.setIcon(winIcon[1]);	} //rock blue
    							else if (tempEnemyCard[2] == 3){
    								gameLblBotWin13.setIcon(winIcon[2]);	} //rock yellow
    							else if (tempEnemyCard[2] == 4){			  //rock green
    								gameLblBotWin13.setIcon(winIcon[3]);	}		break;								
    			}
    			
    			enemyRockWinCtr = enemyRockWinCtr + 3;
    		}
    	
    		else if (tempPlayerCard[1] == 3 && tempEnemyCard[1] == 3) //both scissors
    		{
    			if (tempPlayerCard[0] > tempEnemyCard[0])
    			{    	
    				System.out.println("\nPlayer wins by power!");
    				gameLblDeclare.setIcon(playerPower);
    				playerRoundWin = true;
    				
    				switch (playerScissorsWinCtr) {
    					case 3:		if (tempPlayerCard[2] == 1){
    									gameLblPlayerWin3.setIcon(winIcon[8]);	} //scissors red 
    								else if	(tempPlayerCard[2] == 2){
    									gameLblPlayerWin3.setIcon(winIcon[9]);	} //scissors blue
    								else if (tempPlayerCard[2] == 3){
    									gameLblPlayerWin3.setIcon(winIcon[10]);	} //scissors yellow
    								else if (tempPlayerCard[2] == 4){			  //scissors green
    									gameLblPlayerWin3.setIcon(winIcon[11]);	}		break;
    								
    					case 6:		if (tempPlayerCard[2] == 1){
    									gameLblPlayerWin6.setIcon(winIcon[8]);	}
    								else if	(tempPlayerCard[2] == 2){
    									gameLblPlayerWin6.setIcon(winIcon[9]);	}
    								else if (tempPlayerCard[2] == 3){
    									gameLblPlayerWin6.setIcon(winIcon[10]);	}
    								else if (tempPlayerCard[2] == 4){
    									gameLblPlayerWin6.setIcon(winIcon[11]);	}		break;
    								
    					case 9:		if (tempPlayerCard[2] == 1){
    									gameLblPlayerWin9.setIcon(winIcon[8]);	}
    								else if	(tempPlayerCard[2] == 2){
    									gameLblPlayerWin9.setIcon(winIcon[9]);	}
    								else if (tempPlayerCard[2] == 3){
    									gameLblPlayerWin9.setIcon(winIcon[10]);	}
    								else if (tempPlayerCard[2] == 4){
    									gameLblPlayerWin9.setIcon(winIcon[11]);	}		break;
    								
    					case 12:	if (tempPlayerCard[2] == 1){
    									gameLblPlayerWin12.setIcon(winIcon[8]);	}
    								else if	(tempPlayerCard[2] == 2){
    									gameLblPlayerWin12.setIcon(winIcon[9]);	}
    								else if (tempPlayerCard[2] == 3){
    									gameLblPlayerWin12.setIcon(winIcon[10]);	}
    								else if (tempPlayerCard[2] == 4){
    									gameLblPlayerWin12.setIcon(winIcon[11]);	}		break;
    								
    					case 15:	if (tempPlayerCard[2] == 1){
    									gameLblPlayerWin15.setIcon(winIcon[8]);	}
    								else if	(tempPlayerCard[2] == 2){
    									gameLblPlayerWin15.setIcon(winIcon[9]);	}
    								else if (tempPlayerCard[2] == 3){
    									gameLblPlayerWin15.setIcon(winIcon[10]);	}
    								else if (tempPlayerCard[2] == 4){
    									gameLblPlayerWin15.setIcon(winIcon[11]);	}		break;
    				}
    			
    				playerScissorsWinCtr = playerScissorsWinCtr + 3;
    			}
    		
    		else if	(tempPlayerCard[0] < tempEnemyCard[0])
  		  	{    	
    			System.out.println("\nEnemy wins by power!");
    			gameLblDeclare.setIcon(enemyPower);
    			enemyRoundWin = true;
    			
    			switch (enemyScissorsWinCtr) {
    				case 3:		if (tempEnemyCard[2] == 1){
    								gameLblBotWin3.setIcon(winIcon[8]);	} //scissors red 
    							else if	(tempEnemyCard[2] == 2){
    								gameLblBotWin3.setIcon(winIcon[9]);	} //scissors blue
    							else if (tempEnemyCard[2] == 3){
    								gameLblBotWin3.setIcon(winIcon[10]);	} //scissors yellow
    							else if (tempEnemyCard[2] == 4){			  //scissors green
    								gameLblBotWin3.setIcon(winIcon[11]);	}		break;
    								
    				case 6:		if (tempEnemyCard[2] == 1){
    								gameLblBotWin6.setIcon(winIcon[8]);	}  
    							else if	(tempEnemyCard[2] == 2){
    								gameLblBotWin6.setIcon(winIcon[9]);	} 
    							else if (tempEnemyCard[2] == 3){
    								gameLblBotWin6.setIcon(winIcon[10]);	} 
    							else if (tempEnemyCard[2] == 4){			  
    								gameLblBotWin6.setIcon(winIcon[11]);	}		break;
    								
    				case 9:		if (tempEnemyCard[2] == 1){
    								gameLblBotWin9.setIcon(winIcon[8]);	}  
    							else if	(tempEnemyCard[2] == 2){
    								gameLblBotWin9.setIcon(winIcon[9]);	} 
    							else if (tempEnemyCard[2] == 3){
    								gameLblBotWin9.setIcon(winIcon[10]);	} 
    							else if (tempEnemyCard[2] == 4){			  
    								gameLblBotWin9.setIcon(winIcon[11]);	}		break;
    								
    				case 12:	if (tempEnemyCard[2] == 1){
    								gameLblBotWin12.setIcon(winIcon[8]);	} 
    							else if	(tempEnemyCard[2] == 2){
    								gameLblBotWin12.setIcon(winIcon[9]);	} 
    							else if (tempEnemyCard[2] == 3){
    								gameLblBotWin12.setIcon(winIcon[10]);	} 
    							else if (tempEnemyCard[2] == 4){			  
    								gameLblBotWin12.setIcon(winIcon[11]);	}		break;
    								
    				case 15:	if (tempEnemyCard[2] == 1){
    								gameLblBotWin15.setIcon(winIcon[8]);	} 
    							else if	(tempEnemyCard[2] == 2){
    								gameLblBotWin15.setIcon(winIcon[9]);	} 
    							else if (tempEnemyCard[2] == 3){
    								gameLblBotWin15.setIcon(winIcon[10]);	} 
    							else if (tempEnemyCard[2] == 4){			  
    								gameLblBotWin15.setIcon(winIcon[11]);	}		break;								
    			}
    			
    			enemyScissorsWinCtr = enemyScissorsWinCtr + 3;
  		  	}
    		
    		else if (tempPlayerCard[0] == tempEnemyCard[0])
    		{
    			System.out.println("\nDRAW BY POWER!");
    			gameLblDeclare.setIcon(drawPower);
    		}
    		}				
    	
    		System.out.println("\n-------------------------------------------------------");	
    	
    		if (playerRoundWin == true)
    		{
    			playerWinCard[playerCardCtr] = tempPlayerCard;
    			playerCardCtr++;
    			playerRoundWin = false;
    		}
    		else if (enemyRoundWin == true)
    		{
    			enemyWinCard[enemyCardCtr] = tempEnemyCard;
    			enemyCardCtr++;
    			enemyRoundWin = false;
    		}
    	
    		//check winning cards
    		System.out.println("\nPlayer's Winning Cards: " + Arrays.deepToString(playerWinCard));
    		System.out.println("\nEnemy's Winning Cards: " + Arrays.deepToString(enemyWinCard));
    		System.out.println("\n-------------------------------------------------------\n");
    	
    		//replace chosen card with another card from deck
    		for (int ctr=0,n=0; ctr < playerHand.length; ctr++,n++){
    			if (playerHand[ctr] == chosenCard){
    				playerHand[ctr] = deckStack.pop();
    				int temp = playerHand[ctr];
    				gameBtnDeck[n].setIcon(smolcard[temp]);
    			}
    		}
    	
    		for (int ctr=0; ctr < enemyHand.length; ctr++){
    			if (enemyHand[ctr] == enemyHand[enemyChoice])
    				enemyHand[ctr] = deckStack.pop();
    				 	
    		}
    	
    		//TERMINATION OF BOOLEANS/RESETTING OF VALUES FOR NEXT ROUND
    		goSignal1 = false;
    		playerRoundWin = false;
    		enemyRoundWin = false;  	    	
    		roundCtr++;
    	
    		//CHECKING IF SOMEONE WINS THE GAME
    		//player check
    		for (int ctr=0; ctr < playerWinCard.length; ctr++){
    		//type check
    			if (playerWinCard[ctr][1] == 1)
    				playerType1 = true;
    				
    			if (playerWinCard[ctr][1] == 2)
    				playerType2 = true;
    				
    			if (playerWinCard[ctr][1] == 3)
    				playerType3 = true;
    		
    		//color check
    			if (playerWinCard[ctr][2] == 1 && playerWinCard[ctr][1] == 1) //rocks
    			{
    				playerRedRock = true;
    				playerType1Ctr++;
    			}
    			if (playerWinCard[ctr][2] == 2 && playerWinCard[ctr][1] == 1)
    			{
    				playerBlueRock = true;
    				playerType1Ctr++;
    			}
    			if (playerWinCard[ctr][2] == 3 && playerWinCard[ctr][1] == 1)
    			{
    				playerYellowRock = true;
    				playerType1Ctr++;
    			}
    			if (playerWinCard[ctr][2] == 4 && playerWinCard[ctr][1] == 1)
    			{
    				playerGreenRock = true;
    				playerType1Ctr++;
    			}
    		
    			if (playerWinCard[ctr][2] == 1 && playerWinCard[ctr][1] == 2) //paper
    			{
    				playerRedPaper = true;
    				playerType2Ctr++;
    			}
    			if (playerWinCard[ctr][2] == 2 && playerWinCard[ctr][1] == 2)
    			{
    				playerBluePaper = true;
    				playerType2Ctr++;
    			}
    			if (playerWinCard[ctr][2] == 3 && playerWinCard[ctr][1] == 2)
    			{
    				playerYellowPaper = true;
    				playerType2Ctr++;
    			}
    			if (playerWinCard[ctr][2] == 4 && playerWinCard[ctr][1] == 2)
    			{
    				playerGreenPaper = true;
    				playerType2Ctr++;
    			}
    		
    			if (playerWinCard[ctr][2] == 1 && playerWinCard[ctr][1] == 3) //scissors
    			{
    				playerRedScissors = true;
    				playerType3Ctr++;
    			}
    			if (playerWinCard[ctr][2] == 2 && playerWinCard[ctr][1] == 3)
    			{
    				playerBlueScissors = true;
    				playerType3Ctr++;
    			}
    			if (playerWinCard[ctr][2] == 3 && playerWinCard[ctr][1] == 3)
    			{
    				playerYellowScissors = true;
    				playerType3Ctr++;
    			}
    			if (playerWinCard[ctr][2] == 4 && playerWinCard[ctr][1] == 3)
    			{
    				playerGreenScissors = true;
    				playerType3Ctr++;
    			}
    		}
    	
    		//enemy check
    		for (int ctr1=0; ctr1 < enemyWinCard.length; ctr1++){
    		//type check
    			if (enemyWinCard[ctr1][1] == 1)
    				enemyType1 = true;
    				
    			if (enemyWinCard[ctr1][1] == 2)
    				enemyType2 = true;
    				
    			if (enemyWinCard[ctr1][1] == 3)
    				enemyType3 = true;
    		
    		//color check
    			if (enemyWinCard[ctr1][2] == 1 && enemyWinCard[ctr1][1] == 1) //rocks
    			{
    				enemyRedRock = true;
    				enemyType1Ctr++;
    			}
    			if (enemyWinCard[ctr1][2] == 2 && enemyWinCard[ctr1][1] == 1)
    			{
    				enemyBlueRock = true;
    				enemyType1Ctr++;
    			}
    			if (enemyWinCard[ctr1][2] == 3 && enemyWinCard[ctr1][1] == 1)
    			{
    				enemyYellowRock = true;
    				enemyType1Ctr++;
    			}
    			if (enemyWinCard[ctr1][2] == 4 && enemyWinCard[ctr1][1] == 1)
    			{
    				enemyGreenRock = true;
    				enemyType1Ctr++;
    			}
    		
    			if (enemyWinCard[ctr1][2] == 1 && enemyWinCard[ctr1][1] == 2) //paper
    			{
    				enemyRedPaper = true;
    				enemyType2Ctr++;
    			}
    			if (enemyWinCard[ctr1][2] == 2 && enemyWinCard[ctr1][1] == 2)
    			{
    				enemyBluePaper = true;
    				enemyType2Ctr++;
    			}
    			if (enemyWinCard[ctr1][2] == 3 && enemyWinCard[ctr1][1] == 2)
    			{
    				enemyYellowPaper = true;
    				enemyType2Ctr++;
    			}
    			if (enemyWinCard[ctr1][2] == 4 && enemyWinCard[ctr1][1] == 2)
    			{
    				enemyGreenPaper = true;
    				enemyType2Ctr++;
    			}
    		
    			if (enemyWinCard[ctr1][2] == 1 && enemyWinCard[ctr1][1] == 3) //scissors
    			{
    				enemyRedScissors = true;
    				enemyType3Ctr++;
    			}
    			if (enemyWinCard[ctr1][2] == 2 && enemyWinCard[ctr1][1] == 3)
    			{
    				enemyBlueScissors = true;
    				enemyType3Ctr++;
    			}
    			if (enemyWinCard[ctr1][2] == 3 && enemyWinCard[ctr1][1] == 3)
    			{
    				enemyYellowScissors = true;
    				enemyType3Ctr++;
    			}
    			if (enemyWinCard[ctr1][2] == 4 && enemyWinCard[ctr1][1] == 3)
    			{
    				enemyGreenScissors = true;
    				enemyType3Ctr++;
    			}				   		
    		} //end of this for loop
    	
    		//to check win: 3 of 3 types completed OR 3 of the same type but 3 diff colors
    		//player check
    		if (playerType1 == true && playerType2 == true && playerType3 == true){
    			playerTypeWin = true;
    		}
    		//enemy check	
    		else if (enemyType1 == true && enemyType2 == true && enemyType3 == true){
    			enemyTypeWin = true;
    		}   
    			 
    		//player check				
    		else if (playerType1Ctr >= 3){ //already has 3 rocks, check if different colors
    			if (playerRedRock == true){
    				playerColor1Ctr++;
    			}
    			if (playerBlueRock == true){
    				playerColor1Ctr++;
    			}
    			if (playerYellowRock == true){
    				playerColor1Ctr++;
    			}
    			if (playerGreenRock == true){
    				playerColor1Ctr++;
    			}
    			if (playerColor1Ctr >= 3){
    				playerColorWin = true;
    			}
    		}
    		
    		else if (playerType2Ctr >= 3){ //already has 3 papers, check if different colors
    			if (playerRedPaper == true){
    				playerColor2Ctr++;
    			}
    			if (playerBluePaper == true){
    				playerColor2Ctr++;
    			}
    			if (playerYellowPaper == true){
    				playerColor2Ctr++;
    			}
    			if (playerGreenPaper == true){
    				playerColor2Ctr++;
    			}
    			if (playerColor2Ctr >= 3){
    				playerColorWin = true;
    			}
    		}
    		
    		else if (playerType3Ctr >= 3){ //already has 3 scissors, check if different colors
    			if (playerRedScissors == true){
    				playerColor3Ctr++;
    			}
    			if (playerBlueScissors == true){
    				playerColor3Ctr++;
    			}
    			if (playerYellowScissors == true){
    				playerColor3Ctr++;
    			}
    			if (playerGreenScissors == true){
    				playerColor3Ctr++;
    			}
    			if (playerColor3Ctr >= 3){
    				playerColorWin = true;
    			}
    		}
    		
    		//enemy check			
    		else if (enemyType1Ctr >= 3){ //already has 3 rocks, check if different colors
    			if (enemyRedRock == true){
    				enemyColor1Ctr++;
    			}
    			if (enemyBlueRock == true){
    				enemyColor1Ctr++;
    			}
    			if (enemyYellowRock == true){
    				enemyColor1Ctr++;
    			}
    			if (enemyGreenRock == true){
    				enemyColor1Ctr++;
    			}
    			if (enemyColor1Ctr >= 3){
    				enemyColorWin = true;
    			}
    		}
    		
    		else if (enemyType2Ctr >= 3){ //already has 3 papers, check if different colors
    			if (enemyRedPaper == true){
    				enemyColor2Ctr++;
    			}
    			if (enemyBluePaper == true){
    				enemyColor2Ctr++;
    			}
    			if (enemyYellowPaper == true){
    				enemyColor2Ctr++;
    			}
    			if (enemyGreenPaper == true){
    				enemyColor2Ctr++;
    			}
    			if (enemyColor2Ctr >= 3){
    				enemyColorWin = true;
    			}
    		}
    		
    		else if (enemyType3Ctr >= 3){ //already has 3 scissors, check if different colors
    			if (enemyRedScissors == true){
    				enemyColor3Ctr++;
    			}
    			if (enemyBlueScissors == true){
    				enemyColor3Ctr++;
    			}
    			if (enemyYellowScissors == true){
    				enemyColor3Ctr++;
    			}
    			if (enemyGreenScissors == true){
    				enemyColor3Ctr++;
    			}
    			if (enemyColor3Ctr >= 3){
    				enemyColorWin = true;
    			}
    		}
    	
    		//TERMINATION OF BOOLEANS/RESETTING OF VALUES FOR NEXT ROUND
    		playerType1Ctr=0; playerType2Ctr=0; playerType3Ctr=0;
    		playerRedRock=false; playerRedPaper=false; playerRedScissors=false;
    		playerBlueRock=false; playerBluePaper=false; playerBlueScissors=false;
    		playerYellowRock=false; playerYellowPaper=false; playerYellowScissors=false;
    		playerGreenRock=false; playerGreenPaper=false; playerGreenScissors=false;
    		playerColor1Ctr=0; playerColor2Ctr=0; playerColor3Ctr=0;
    		playerType1=false; playerType2=false; playerType3=false;
    		    	
    		enemyType1Ctr=0; enemyType2Ctr=0; enemyType3Ctr = 0;
    		enemyType1=false; enemyType2=false; enemyType3=false;
    		enemyRedRock=false; enemyRedPaper=false; enemyRedScissors=false;
    		enemyBlueRock=false; enemyBluePaper=false; enemyBlueScissors=false;
    		enemyYellowRock=false; enemyYellowPaper=false; enemyYellowScissors=false;
    		enemyGreenRock=false; enemyGreenPaper=false; enemyGreenScissors=false;
    		enemyColor1Ctr=0; enemyColor2Ctr=0; enemyColor3Ctr=0;    	    	
    		enemyType1=false; enemyType2=false; enemyType3=false;
    		
    		gameBtnPlay.setEnabled(false);
		
			//}//END BRACKET OF 1 ROUND LOOP	
			//while(playerTypeWin == false && playerColorWin == false && enemyTypeWin == false && enemyColorWin == false);
		
			//CONDITION FOR WINNING
			if (playerTypeWin == true)
			{
				System.out.println("\n\nCONGRATULATIONS!! Player won by ROCK, PAPER, SCISSORS!!");
				gameLblDeclare.setIcon(playerWon);
				for(int x=0;x<playerHand.length;x++){
					gameBtnDeck[x].setEnabled(false);
				}
				stackCtr = deckStack.size();
			}
			else if (enemyTypeWin == true)
			{
				System.out.println("\n\nSORRY!! Enemy won by ROCK, PAPER, SCISSORS!!");
				gameLblDeclare.setIcon(enemyWon);
				for(int x=0;x<enemyHand.length;x++){
					gameBtnDeck[x].setEnabled(false);
				}
				stackCtr = deckStack.size();
			}
			else if (playerColorWin == true)
			{
				System.out.println("\n\nCONGRATULATIONS!! Player won by using 3 different COLORS!!");
				gameLblDeclare.setIcon(playerWon);
				for(int x=0;x<playerHand.length;x++){
					gameBtnDeck[x].setEnabled(false);
				}
				stackCtr = deckStack.size();
			}
			else if (enemyColorWin == true)
			{
				System.out.println("\n\nSORRY!! Enemy won by using 3 different COLORS!!");
				gameLblDeclare.setIcon(enemyWon);
				for(int x=0;x<enemyHand.length;x++){
					gameBtnDeck[x].setEnabled(false);
				}
				stackCtr = deckStack.size();
			}
		}//END BRACKET OF PLAY BUTTON
	}
	
	public static void main(String[] args){
		kazujanken bonk = new kazujanken();
		//File bgm = new File("D:\\Rj Folder\\BCS23\\Data Struct\\Data Struct Finals\\BGM ninja.wav");//rebs
		File bgm = new File("C:\\Users\\Abdullah\\Desktop\\Kazu Janken\\BGM ninja.wav");//matt
        playStart(bgm);
    }
    static void playStart(File Sound){
        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);

            Thread.sleep(clip.getMicrosecondLength()/1000);
        }catch(Exception e)
        {
        }
	}
}