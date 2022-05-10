package com.xxy.Handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * creat by sml
 * 2022-05-10
 **/
//插入时候及时填充策略
@Component
public class usersHandler  implements MetaObjectHandler  {
        @Override
        public void insertFill(MetaObject metaObject) {
            this.strictInsertFill(metaObject, "creatTime", Date.class, new Date());
            this.strictInsertFill(metaObject, "updateTime", Date.class, new Date());
        }

        @Override
        public void updateFill(MetaObject metaObject) {
            this.strictUpdateFill(metaObject, "updateTime", Date.class, new Date());
        }
    }



