## 框架封装了base基类,引入了Rxjava+retrofit2+Gjson主流框架,包括其他一些快速开发的lib(AutoLayout等),插件(Buttknife等),也包含了平时积累的一些Utils

## 页面框架：搭建用Activity+fragment,用fragment来管理其子模块(show,,hide方式(不需要重新inflate view ) , replace这种方式会重新加载view 效率不高)跳转子页面用SubActivity 作为fragment容器,  通过反射方式 , 在subActivity 的生命周期方法, onCreat中去实例化Fragment , 然后去加载传入的fragment(showTargetPage)然后再basefragment中 管理 eventbus的生命周期, 回退键 , 加载框, toast, 以及fragment 页面之间的数据传递(回调方式, 当然也可以用eventbus)

## 目标是遇到比较好用的主流框架还会集成进来,还会继续优化,尽可能的搭建一个可进行快速开发容易上手的一个框架.


# 用法

## 图片框架
###对于第三方图片加载框架做了封装,可支持Glide,Fresco(ImageLoader,Picasso需自行封装),当不同的项目需要使用不同的框架时,直接修改封装类就可以了,如果项目中需要更换图片框架时,也不需要对代码进行修改
###使用前请在'Application'的'onCreate()'中进行初始化:
    ```java
    	ImageLoaderManager.getInstance().init(this);
    ```
###调用
    ```java
    	ImageLoaderManager.getInstance().showImage(ImageLoaderManager.getDefaultOptions(image,url));
    ```
## 网络框架
###使用的是RxJava+Retrofit+OkHttp的方式,但是没有使用Gson解析数据,而是返回的String,如果需要可以自行转成Gson解析,或者其他的方式解析

###调用
####activity继承
     ```java
     public class MainActivity extends RxAppCompatActivity implements View.OnClickListener, HttpOnNextListener
     ```
####初始化对象
     ```java
     HttpManager manager = new HttpManager(this, this);
     ```
####封装一个实体类继承'BaseApi'

####调用'manager.doHttpDeal();'传入实体类设置好的参数