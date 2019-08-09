package com.example.proxy.demo1;

import com.example.proxy.demo0.ISinger;

/**
 *
 * 目标对象实现了某一个接口
 *  - Singer 实现了 ISinger
 * Project <demo-project>
 * Created by jorgezhong on 2019/6/24 15:59.
 */
public class Singer implements ISinger {
    @Override
    public void sing() {
        System.out.println("唱一会儿歌");
    }
}
