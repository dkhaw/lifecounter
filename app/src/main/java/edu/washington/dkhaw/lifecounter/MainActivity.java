package edu.washington.dkhaw.lifecounter;

import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private int p1lives = 10;
    private int p2lives = 10;
    private int p3lives = 10;
    private int p4lives = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*public void playerLoses(int player) {
            Context context = getApplicationContext();
            CharSequence text = "Player " + player + " LOSES!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }*/

        Button p1minusfive = (Button) findViewById(R.id.p1minusfive);
        p1minusfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.p1lives);
                int lives = p1lives - 5;
                tv.setText("" + lives);
                p1lives -= 5;
                if (lives <= 0) {
                    Context context = getApplicationContext();
                    CharSequence text = "Player 1 LOSES!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

        Button p1minusone = (Button) findViewById(R.id.p1minusone);
        p1minusone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.p1lives);
                int lives = p1lives - 1;
                tv.setText("" + lives);
                p1lives -= 1;
                if (lives <= 0) {
                    Context context = getApplicationContext();
                    CharSequence text = "Player 1 LOSES!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

        Button p1plusone = (Button) findViewById(R.id.p1plusone);
        p1plusone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.p1lives);
                int lives = p1lives + 1;
                tv.setText("" + lives);
                p1lives += 1;
                if (lives <= 0) {
                    Context context = getApplicationContext();
                    CharSequence text = "Player 1 LOSES!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

        Button p1plusfive = (Button) findViewById(R.id.p1plusfive);
        p1plusfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.p1lives);
                int lives = p1lives + 5;
                tv.setText("" + lives);
                p1lives += 5;
                if (lives <= 0) {
                    Context context = getApplicationContext();
                    CharSequence text = "Player 1 LOSES!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

        Button p2minusfive = (Button) findViewById(R.id.p2minusfive);
        p2minusfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.p2lives);
                int lives = p2lives - 5;
                tv.setText("" + lives);
                p2lives -= 5;
                if (lives <= 0) {
                    Context context = getApplicationContext();
                    CharSequence text = "Player 2 LOSES!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

        Button p2minusone = (Button) findViewById(R.id.p2minusone);
        p2minusone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.p2lives);
                int lives = p2lives - 1;
                tv.setText("" + lives);
                p2lives -= 1;
                if (lives <= 0) {
                    Context context = getApplicationContext();
                    CharSequence text = "Player 2 LOSES!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

        Button p2plusone = (Button) findViewById(R.id.p2plusone);
        p2plusone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.p2lives);
                int lives = p2lives + 1;
                tv.setText("" + lives);
                p2lives += 1;
                if (lives <= 0) {
                    Context context = getApplicationContext();
                    CharSequence text = "Player 2 LOSES!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

        Button p2plusfive = (Button) findViewById(R.id.p2plusfive);
        p2plusfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.p2lives);
                int lives = p2lives + 5;
                tv.setText("" + lives);
                p2lives += 5;
                if (lives <= 0) {
                    Context context = getApplicationContext();
                    CharSequence text = "Player 2 LOSES!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

        Button p3minusfive = (Button) findViewById(R.id.p3minusfive);
        p3minusfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.p3lives);
                int lives = p3lives - 5;
                tv.setText("" + lives);
                p3lives -= 5;
                if (lives <= 0) {
                    Context context = getApplicationContext();
                    CharSequence text = "Player 3 LOSES!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

        Button p3minusone = (Button) findViewById(R.id.p3minusone);
        p3minusone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.p3lives);
                int lives = p3lives - 1;
                tv.setText("" + lives);
                p3lives -= 1;
                if (lives <= 0) {
                    Context context = getApplicationContext();
                    CharSequence text = "Player 3 LOSES!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

        Button p3plusone = (Button) findViewById(R.id.p3plusone);
        p3plusone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.p3lives);
                int lives = p3lives + 1;
                tv.setText("" + lives);
                p3lives += 1;
                if (lives <= 0) {
                    Context context = getApplicationContext();
                    CharSequence text = "Player 3 LOSES!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

        Button p3plusfive = (Button) findViewById(R.id.p3plusfive);
        p3plusfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.p3lives);
                int lives = p3lives + 5;
                tv.setText("" + lives);
                p3lives += 5;
                if (lives <= 0) {
                    Context context = getApplicationContext();
                    CharSequence text = "Player 3 LOSES!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

        Button p4minusfive = (Button) findViewById(R.id.p4minusfive);
        p4minusfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.p4lives);
                int lives = p4lives - 5;
                tv.setText("" + lives);
                p4lives -= 5;
                if (lives <= 0) {
                    Context context = getApplicationContext();
                    CharSequence text = "Player 4 LOSES!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

        Button p4minusone = (Button) findViewById(R.id.p4minusone);
        p4minusone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.p4lives);
                int lives = p4lives - 1;
                tv.setText("" + lives);
                p4lives -= 1;
                if (lives <= 0) {
                    Context context = getApplicationContext();
                    CharSequence text = "Player 4 LOSES!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

        Button p4plusone = (Button) findViewById(R.id.p4plusone);
        p4plusone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.p4lives);
                int lives = p4lives + 1;
                tv.setText("" + lives);
                p4lives += 1;
                if (lives <= 0) {
                    Context context = getApplicationContext();
                    CharSequence text = "Player 4 LOSES!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

        Button p4plusfive = (Button) findViewById(R.id.p4plusfive);
        p4plusfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.p4lives);
                int lives = p4lives + 5;
                tv.setText("" + lives);
                p4lives += 5;
                if (lives <= 0) {
                    Context context = getApplicationContext();
                    CharSequence text = "Player 4 LOSES!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putInt("p1ID", p1lives);
        savedInstanceState.putInt("p2ID", p2lives);
        savedInstanceState.putInt("p3ID", p3lives);
        savedInstanceState.putInt("p4ID", p4lives);

    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        int p1current = savedInstanceState.getInt("p1ID");
        int p2current = savedInstanceState.getInt("p2ID");
        int p3current = savedInstanceState.getInt("p3ID");
        int p4current = savedInstanceState.getInt("p4ID");

        TextView p1tv = (TextView) findViewById(R.id.p1lives);
        p1tv.setText("" + p1current);
        TextView p2tv = (TextView) findViewById(R.id.p2lives);
        p2tv.setText("" + p2current);
        TextView p3tv = (TextView) findViewById(R.id.p3lives);
        p3tv.setText("" + p3current);
        TextView p4tv = (TextView) findViewById(R.id.p4lives);
        p4tv.setText("" + p4current);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}