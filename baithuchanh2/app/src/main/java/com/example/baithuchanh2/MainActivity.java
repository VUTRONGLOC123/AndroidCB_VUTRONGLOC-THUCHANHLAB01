package com.example.baithuchanh2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView ivDice;
    private Button btnGenerate;
    private Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ivDice = findViewById(R.id.ivDice);
        btnGenerate = findViewById(R.id.btnGenerate);
        random = new Random();

        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tạo số ngẫu nhiên từ 1 đến 6
                int randomNumber = random.nextInt(6) + 1;


                // Cập nhật hình ảnh xúc xắc tương ứng
                switch (randomNumber) {
                    case 1:
                        ivDice.setImageResource(R.drawable.dice_1);
                        break;
                    case 2:
                        ivDice.setImageResource(R.drawable.dice_2);
                        break;
                    case 3:
                        ivDice.setImageResource(R.drawable.dice_3);
                        break;
                    case 4:
                        ivDice.setImageResource(R.drawable.dice_4);
                        break;
                    case 5:
                        ivDice.setImageResource(R.drawable.dice_5);
                        break;
                    case 6:
                        ivDice.setImageResource(R.drawable.dice_6);
                        break;
                }
            }
        });
    }
}
