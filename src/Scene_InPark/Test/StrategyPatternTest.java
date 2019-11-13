package Scene_InPark.Test;

import Scene_InPark.Class.TourPlan.RealizePlayPlan;

import java.util.Scanner;

public class StrategyPatternTest {
    public static void strategyPatternTest(){
        System.out.println("\n" +"----------------------------------------");
        System.out.println("17. 策略模式(Strategy Pattern)：");
        System.out.println("\n"+"测试:");

        Scanner scan = new Scanner(System.in);
        int afternoonPlan = 0;

        //获取策略模板实例
        RealizePlayPlan mPlan = new RealizePlayPlan();

        //默认设置上午计划
        String morningPlan = "米奇大街 奇想花园";
        mPlan.setMorningPlan(morningPlan);

        System.out.println("游园规划：进入迪士尼 米奇大街 奇想花园 吃午饭 下午活动（待计划） 出门离去 吃晚饭 去住宿");
        System.out.println("请选择下午的游玩计划：策略1(1),策略2(2),策略3(3)");
        System.out.print("请输入:");
        if(scan.hasNextInt()){
            afternoonPlan = scan.nextInt();
        }

        //设置下午游园策略
        mPlan.setStrategy(afternoonPlan);
        //打印最终游园计划表

        mPlan.agendaForTheDay();

        System.out.println("----------------------------------------");
    }
}
