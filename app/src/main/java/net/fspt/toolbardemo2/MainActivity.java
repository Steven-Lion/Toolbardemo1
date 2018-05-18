package net.fspt.toolbardemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //todo 4:在Activity中实例化Toolbar
    private Toolbar toolbar  = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //todo 4:在Activity中实例化Toolbar
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        //use Toolbar replace Actionbar
        setSupportActionBar(toolbar);

    }

    /*todo 5:生成标题栏选项菜单*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //get Menu file Of XML
        getMenuInflater().inflate(R.menu.home_toolbar_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    /*todo 6:当标题栏选项菜单被选中时，事件响应代码*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_set_login:
                Toast.makeText(this,item.getTitle(),Toast.LENGTH_LONG).show();
                break;
            case R.id.action_set_threshold:
                Toast.makeText(this,item.getTitle(),Toast.LENGTH_LONG).show();
                break;

        }
        return true;
    }
}
