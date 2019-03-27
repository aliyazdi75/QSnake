package android.quera.com.mario;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends Activity {

    int snake_pos = 15, food_pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.three_three);
        tv.setBackgroundResource(R.color.snake_color);
        randomFood();
        TextView up = (TextView) findViewById(R.id.up);
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = findID(snake_pos);
                tv.setBackgroundResource(R.color.default_background);
                posDir(1);
                tv = findID(snake_pos);
                tv.setBackgroundResource(R.color.snake_color);
                if (snake_pos == food_pos)
                    randomFood();
            }
        });
        TextView right = (TextView) findViewById(R.id.right);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = findID(snake_pos);
                tv.setBackgroundResource(R.color.default_background);
                posDir(2);
                tv = findID(snake_pos);
                tv.setBackgroundResource(R.color.snake_color);
                if (snake_pos == food_pos)
                    randomFood();
            }
        });
        TextView down = (TextView) findViewById(R.id.down);
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = findID(snake_pos);
                tv.setBackgroundResource(R.color.default_background);
                posDir(3);
                tv = findID(snake_pos);
                tv.setBackgroundResource(R.color.snake_color);
                if (snake_pos == food_pos)
                    randomFood();
            }
        });
        TextView left = (TextView) findViewById(R.id.left);
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = findID(snake_pos);
                tv.setBackgroundResource(R.color.default_background);
                posDir(4);
                tv = findID(snake_pos);
                tv.setBackgroundResource(R.color.snake_color);
                if (snake_pos == food_pos)
                    randomFood();
            }
        });
    }

    public void randomFood() {
        Random random = new Random();
        food_pos = random.nextInt(37);
        while (food_pos == snake_pos)
            food_pos = random.nextInt(37);
        TextView tv = findID(food_pos);
        tv.setBackgroundResource(R.color.food_color);
    }

    public void posDir(int dir) {
        if (dir == 1) {
            if (snake_pos > 6)
                snake_pos -= 6;
        } else if (dir == 2) {
            if (snake_pos % 6 != 0)
                snake_pos++;
        } else if (dir == 3) {
            if (snake_pos < 31)
                snake_pos += 6;
        } else if (dir == 4) {
            if (snake_pos % 6 != 1)
                snake_pos--;
        }
    }

    public TextView findID(int id) {
        switch (id) {
            case 1:
                return (TextView) findViewById(R.id.one_one);
            case 2:
                return (TextView) findViewById(R.id.one_two);
            case 3:
                return (TextView) findViewById(R.id.one_three);
            case 4:
                return (TextView) findViewById(R.id.one_four);
            case 5:
                return (TextView) findViewById(R.id.one_five);
            case 6:
                return (TextView) findViewById(R.id.one_six);
            case 7:
                return (TextView) findViewById(R.id.two_one);
            case 8:
                return (TextView) findViewById(R.id.two_two);
            case 9:
                return (TextView) findViewById(R.id.two_three);
            case 10:
                return (TextView) findViewById(R.id.two_four);
            case 11:
                return (TextView) findViewById(R.id.two_five);
            case 12:
                return (TextView) findViewById(R.id.two_six);
            case 13:
                return (TextView) findViewById(R.id.three_one);
            case 14:
                return (TextView) findViewById(R.id.three_two);
            case 15:
                return (TextView) findViewById(R.id.three_three);
            case 16:
                return (TextView) findViewById(R.id.three_four);
            case 17:
                return (TextView) findViewById(R.id.three_five);
            case 18:
                return (TextView) findViewById(R.id.three_six);
            case 19:
                return (TextView) findViewById(R.id.four_one);
            case 20:
                return (TextView) findViewById(R.id.four_two);
            case 21:
                return (TextView) findViewById(R.id.four_three);
            case 22:
                return (TextView) findViewById(R.id.four_four);
            case 23:
                return (TextView) findViewById(R.id.four_five);
            case 24:
                return (TextView) findViewById(R.id.four_six);
            case 25:
                return (TextView) findViewById(R.id.five_one);
            case 26:
                return (TextView) findViewById(R.id.five_two);
            case 27:
                return (TextView) findViewById(R.id.five_three);
            case 28:
                return (TextView) findViewById(R.id.five_four);
            case 29:
                return (TextView) findViewById(R.id.five_five);
            case 30:
                return (TextView) findViewById(R.id.five_six);
            case 31:
                return (TextView) findViewById(R.id.six_one);
            case 32:
                return (TextView) findViewById(R.id.six_two);
            case 33:
                return (TextView) findViewById(R.id.six_three);
            case 34:
                return (TextView) findViewById(R.id.six_four);
            case 35:
                return (TextView) findViewById(R.id.six_five);
            case 36:
                return (TextView) findViewById(R.id.six_six);
        }
        return null;
    }
}
