package sunger.net.org.elestickheader;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import net.cachapa.expandablelayout.ExpandableLayout;

/**
 * Created by wangwei on 2017/10/31.
 */

public class TestActivity extends AppCompatActivity {
    private ExpandableLayout expandableLayout;
    private Button btn, col;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        expandableLayout = (ExpandableLayout) findViewById(R.id.expandableLayout);
        btn = (Button) findViewById(R.id.btn);
        col = (Button) findViewById(R.id.col);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandableLayout.expand();
            }
        });
        col.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandableLayout.collapse();
            }
        });


    }
}
