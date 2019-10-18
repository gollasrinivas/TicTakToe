package com.example.tictok

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
var turn=1
    var count=0
    var top=-1
    var score=0
    var score1=0
    var game=0
    var gameOver=false
    var stk= arrayOf(0,0,0,0,0,0,0,0,0)
    var click= arrayOf(false,false,false,false,false,false,false,false,false)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val bundle=intent.extras
        game=bundle!!.getInt("games")
        game--
       //game= noOfGames(game)
games.text=game.toString()
    }
    @SuppressLint("SetTextI18n")
    fun btnClick(v:View)
    {
        if(v.id==oneBtn.id)
            {
                if(!gameOver) {
                    if(!click[0]) {
                        if(turn==1) {
                            oneBtn.text="O"
                            turn=2
                            click[0]=true
                           players_turn.text="PLAYER-2"
                            push(1)
                            count++
                            if(checkForWin()) {
                                player1win()


                            }
                        } else if(turn==2) {
                            oneBtn.text="X"
                            turn=1
                            click[0]=true
                            players_turn.text="PLAYER-1"
                            count++
                            push(1)
                            if(checkForWin()) {
                                player2win()


                            }
                        }
                    }
                }
            }
            if(v.id==twoBtn.id)
                {
                    if(!gameOver) {
                        if(!click[1]) {
                            if(turn==1) {
                                twoBtn.text="O"
                                turn=2
                                click[1]=true
                                players_turn.text="PLAYER-2"
                                count++
                                push(2)
                                if(checkForWin()) {
                                    player1win()


                                }
                            } else if(turn==2) {
                                twoBtn.text="X"
                                turn=1
                                click[1]=true
                                players_turn.text="PLAYER-1"
                                count++
                                push(2)
                                if(checkForWin()) {
                                    player2win()


                                }
                            }
                        }
                    }

                }
        if(v.id==threeBtn.id)
            {
                if(!gameOver) {
                    if(!click[2]) {
                        if(turn==1) {
                            threeBtn.text="O"
                            turn=2
                            click[2]=true
                            players_turn.text="PLAYER-2"
                            count++
                            push(3)
                            if(checkForWin()) {
                                player1win()


                            }
                        } else if(turn==2) {
                            threeBtn.text="X"
                            turn=1
                            click[2]=true
                            players_turn.text="PLAYER-1"
                            count++
                            push(3)
                            if(checkForWin()) {
                                player2win()


                            }
                        }
                    }
                }
            }
            if(v.id==fourBtn.id)
                {
                    if(!gameOver) {
                        if(!click[3]) {
                            if(turn==1) {
                                fourBtn.text="O"
                                turn=2
                                click[3]=true
                                players_turn.text="PLAYER-2"
                                count++
                                push(4)
                                if(checkForWin()) {
                                    player1win()


                                }
                            } else if(turn==2) {
                                fourBtn.text="X"
                                turn=1
                                click[3]=true
                                players_turn.text="PLAYER-1"
                                count++
                                push(4)
                                if(checkForWin()) {
                                    player2win()


                                }
                            }
                        }
                    }
                }
                if(v.id==fiveBtn.id)
                    {
                        if(!gameOver) {
                            if(!click[4]) {
                                if(turn==1) {
                                    fiveBtn.text="O"
                                    turn=2
                                    click[4]=true
                                    players_turn.text="PLAYER-2"
                                    count++
                                    push(5)
                                    if(checkForWin()) {
                                        player1win()


                                    }
                                } else if(turn==2) {
                                    fiveBtn.text="X"
                                    turn=1
                                    click[4]=true
                                    players_turn.text="PLAYER-1"
                                    count++
                                    push(5)
                                    if(checkForWin()) {
                                        player2win()


                                    }
                                }
                            }
                        }
                    }
                    if(v.id==sixBtn.id)
                        {
                            if(!gameOver) {
                                if(!click[5]) {
                                    if(turn==1) {
                                        sixBtn.text="O"
                                        turn=2
                                        click[5]=true
                                        players_turn.text="PLAYER-2"
                                        count++
                                        push(6)
                                        if(checkForWin()) {
                                            player1win()


                                        }
                                    } else if(turn==2) {
                                        sixBtn.text="X"
                                        turn=1
                                        click[5]=true
                                        players_turn.text="PLAYER-1"
                                        count++
                                        push(6)
                                        if(checkForWin()) {
                                            player2win()


                                        }
                                    }
                                }
                            }
                        }
                        if(v.id==sevenBtn.id)
                            {
                                if(!gameOver) {
                                    if(!click[6]) {
                                        if(turn==1) {
                                            sevenBtn.text="O"
                                            turn=2
                                            click[6]=true
                                            players_turn.text="PLAYER-2"
                                            count++
                                            push(7)
                                            if(checkForWin()) {
                                                player1win()


                                            }
                                        } else if(turn==2) {
                                            sevenBtn.text="X"
                                            turn=1
                                            click[7]=true
                                            players_turn.text="PLAYER-1"
                                            count++
                                            push(7)
                                            if(checkForWin()) {
                                                player2win()


                                            }
                                        }
                                    }
                                }

                            }
                            if(v.id==eightBtn.id)
                                {
                                    if(!gameOver) {
                                        if(!click[7]) {
                                            if(turn==1) {
                                                eightBtn.text="O"
                                                turn=2
                                                click[7]=true
                                                players_turn.text="PLAYER-2"
                                                count++
                                                push(8)
                                                if(checkForWin()) {
                                                    player1win()


                                                }
                                            } else if(turn==2) {
                                                eightBtn.text="X"
                                                turn=1
                                                click[7]=true
                                                players_turn.text="PLAYER-1"
                                                count++
                                                push(8)
                                                if(checkForWin()) {
                                                    player2win()


                                                }
                                            }
                                        }
                                    }
                                }
                                if(v.id==nineBtn.id)
                                    {
                                        if(!gameOver) {
                                            if(!click[8]) {
                                                if(turn==1) {
                                                    nineBtn.text="O"
                                                    turn=2
                                                    click[8]=true
                                                    players_turn.text="PLAYER-2"
                                                    count++
                                                    push(9)
                                                    if(checkForWin()) {
                                                        player1win()


                                                    }
                                                } else if(turn==2) {
                                                    nineBtn.text="X"
                                                    turn=1
                                                    click[8]=true
                                                    players_turn.text="PLAYER-1"
                                                    count++
                                                    push(9)
                                                    if(checkForWin()) {
                                                        player2win()


                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if(v.id==wrong.id)
                                        {
                                            if(top>=0) {
                                                when(stk[top]) {
                                                    1-> {
                                                        oneBtn.text = ""
                                                        click[0] = false;
                                                        if (turn == 2) {
                                                            turn = 1
                                                            players_turn.text="PLAYER-1"
                                                        } else if(turn==1) {
                                                            turn = 2
                                                            players_turn.text="PLAYER-2"
                                                        }
                                                        count--
                                                        top--
                                                    }
                                                    2-> {
                                                        twoBtn.text = ""
                                                        click[1] = false;
                                                        if (turn == 2) {
                                                            turn = 1
                                                            players_turn.text="PLAYER-1"
                                                        } else if(turn==1) {
                                                            turn = 2
                                                            players_turn.text="PLAYER-2"
                                                        }
                                                        count--
                                                        top--
                                                    }
                                                    3-> {
                                                        threeBtn.text = ""
                                                        click[2] = false;
                                                        if (turn == 2) {
                                                            turn = 1
                                                            players_turn.text="PLAYER-1"
                                                        } else if(turn==1) {
                                                            turn = 2
                                                            players_turn.text="PLAYER-2"
                                                        }
                                                        count--
                                                        top--
                                                    }
                                                    4-> {
                                                        fourBtn.text = ""
                                                        click[3] = false;
                                                        if (turn == 2) {
                                                            turn = 1
                                                            players_turn.text="PLAYER-1"
                                                        } else if(turn==1) {
                                                            turn = 2
                                                            players_turn.text="PLAYER-2"
                                                        }
                                                        count--
                                                        top--
                                                    }
                                                    5-> {
                                                        fiveBtn.text = ""
                                                        click[4] = false;
                                                        if (turn == 2) {
                                                            turn = 1
                                                            players_turn.text="PLAYER-1"
                                                        } else if(turn==1) {
                                                            turn = 2
                                                            players_turn.text="PLAYER-2"
                                                        }
                                                        count--
                                                        top--
                                                    }
                                                    6-> {
                                                        sixBtn.text = ""
                                                        click[5] = false;
                                                        if (turn == 2) {
                                                            turn = 1
                                                            players_turn.text="PLAYER-1"
                                                        } else if(turn==1) {
                                                            turn = 2
                                                            players_turn.text="PLAYER-2"
                                                        }
                                                        count--
                                                        top--
                                                    }
                                                    7-> {
                                                        sevenBtn.text = ""
                                                        click[6] = false;
                                                        if (turn == 2) {
                                                            turn = 1
                                                            players_turn.text="PLAYER-1"
                                                        } else if(turn==1) {
                                                            turn = 2
                                                            players_turn.text="PLAYER-2"
                                                        }
                                                        count--
                                                        top--
                                                    }
                                                    8-> {
                                                        eightBtn.text = ""
                                                        click[7] = false;
                                                        if (turn == 2) {
                                                            turn = 1
                                                            players_turn.text="PLAYER-1"
                                                        } else if(turn==1) {
                                                            turn = 2
                                                            players_turn.text="PLAYER-2"
                                                        }
                                                        count--
                                                        top--
                                                    }
                                                    9-> {
                                                        nineBtn.text = ""
                                                        click[8] = false;
                                                        if (turn == 2) {
                                                            turn = 1
                                                            players_turn.text="PLAYER-1"
                                                        } else if(turn==1) {
                                                            turn = 2
                                                            players_turn.text="PLAYER-2"
                                                        }
                                                        count--
                                                        top--
                                                    }

                                                }
                                            }
                                            else
                                            {
                                                if(game>=0) {
                                                    gameOver=false
                                                    games.text=game.toString()
                                                } else
                                                {
                                                    if(score>score1)
                                                        Toast.makeText(this,"player 1 wins",Toast.LENGTH_LONG).show()
                                                    if(score<score1)
                                                        Toast.makeText(this,"player 2 wins",Toast.LENGTH_SHORT).show()
                                                    if(score==score1)
                                                        Toast.makeText(this,"match tied",Toast.LENGTH_SHORT).show()
                                                    turns.text="GAME"
                                                    players_turn.text="OVER"
                                                }
                                            }
                                        }

    }
 //   fun noOfGames(game:Int):Int{
   //     var g=game
     //   if(count==9)
       //     if(g)
         //   g--
   //     else
     //   {

       // }
    //}
    fun checkForWin():Boolean
       {

           if(oneBtn.text.equals(twoBtn.text)&&oneBtn.text.equals(threeBtn.text)&&!oneBtn.text.equals(""))
           {
             return true
           }
           if(fourBtn.text.equals(fiveBtn.text)&&fourBtn.text.equals(sixBtn.text)&&!fourBtn.text.equals(""))
           {
               return true
           }
           if(sevenBtn.text.equals(eightBtn.text)&&sevenBtn.text.equals(nineBtn.text)&&!sevenBtn.text.equals(""))
           {
               return true
           }
           if(oneBtn.text.equals(fourBtn.text)&&oneBtn.text.equals(sevenBtn.text)&&!oneBtn.text.equals(""))
           {
               return true
           }
           if(twoBtn.text.equals(fiveBtn.text)&&twoBtn.text.equals(eightBtn.text)&&!twoBtn.text.equals(""))
           {
               return true
           }
           if(threeBtn.text.equals(sixBtn.text)&&threeBtn.text.equals(nineBtn.text)&&!threeBtn.text.equals(""))
           {
               return true
           }
           if(oneBtn.text.equals(fiveBtn.text)&&oneBtn.text.equals(nineBtn.text)&&!oneBtn.text.equals(""))
           {
               return true
           }
           if(threeBtn.text.equals(fiveBtn.text)&&threeBtn.text.equals(sevenBtn.text)&&!threeBtn.text.equals(""))
           {
               return true
           }
           return false

       }
    @SuppressLint("SetTextI18n")
    fun player1win()
    {
        turns.text="win::"
        players_turn.text="PlAYER1"
       // score=player1_score.text.toString().toInt()
        score++
        p1_score.text=score.toString()
        gameOver=true
        game--
    }
    @SuppressLint("SetTextI18n")
    fun player2win()
    {
        turns.text="win::"
        players_turn.text="PlAYER2"
        //score=player2_score.text.toString().toInt()
        score1++
        p2_score.text=score1.toString()
        gameOver=true
        game--
    }
    fun push(ele:Int)
    {
        if(top<9)
        {
            top++
            stk[top]=ele
        }

    }

}
