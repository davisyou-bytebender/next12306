import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author davis you
 * @Date 2022/8/7 8:12 PM
 * @Version 1.0
 */
public class Generator {
    public void generator() throws Exception{
//        File file = new File("./data.txt");
//        OutputStream outputStream = new FileOutputStream(file);
//        byte[] bytes = new byte[5];
//        outputStream.write(bytes);


        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //指定 逆向工程配置文件
        File configFile = new File("./generator/src/main/java/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                callback, warnings);
        myBatisGenerator.generate(null);

    }
    public static void main(String[] args) throws Exception {
        try {
            Generator generator = new Generator();
            generator.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
