package edu.exception.pack2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
catch 구문 여러 개 작성하기
1) throw : 예외 강제 발생
2) 예외 + 다향성
    - catch 문 여러 개 작성 시
      부모 예외를 처리하는 catch 문이 자식 예외도 모두 잡아서 처리
        => 부모 예외(Exception) 을 맨 아래쪽에 작성해야 프로그램 상 문제가 없음!

throw 는 Java 프로그램 상 문제가 없지만, 회사 내 프로그램에서 소비자가 진행하면 안 되는 행동이 발생할 경우
     진행하지 못하도록 정지 후, 회사가 원하는 방향으로 프로그램이 진행될 수 있도록 처리.
 */
public class ExceptionEx2 {
    Scanner sc=new Scanner(System.in);

    /*
     throw new 문제가발생할상황에대한명칭Exception();

     case 1에서 문제가 발생할 경우 break; 를 작성하지 않아도
     1번에서 문제가 발생했기 때문에 method1() 기능 자체를 중단함
     => 따라서 break; 를 작성하지 않아도 case 2번부터 default 까지 내용들이 출력되지 않음.

     case 1: throw new ArithmeticException("개발자가 발생시킨 문제 1번");
     case 2: throw new NullPointerException("개발자가 발생시킨 문제 2번");
     case 3: throw new ClassCastException();
     case 4:throw new RuntimeException();
     case 0:
        System.out.println("프로그램 종료");
        System.exit(0);
     default: System.out.println("메뉴에 작성된 번호만 입력해주세요.");
     */
    public void method1(){
        while (true) {
            System.out.println("[예외 강제 발생 시키기]");

            System.out.println("1. ArithmeticException");
            System.out.println("2. NullPointerException");
            System.out.println("3. ClassCastException");
            System.out.println("4. RuntimeException");
            System.out.println("0. 종료");
            System.out.print("예외 선택 >> ");
            int choice = sc.nextInt();

            // throw new예외() : 개발자가 예외를 강제로 발생시킬 때 사용하는 구문
            switch (choice) {
                case 1:
                    throw new ArithmeticException("개발자가 발생시킨 문제 1번");
                    // break;  -> 1번에서 실행했을 때 method1() 기능을 더 이상 진행할 수 없도록
                    //            throw new 를 설정했기 때문에 break; 를 작성할 수 없음.
                case 2: throw new NullPointerException("개발자가 발생시킨 문제 2번");
                case 3: throw new ClassCastException();
                /*
                Exception in thread "main" java.lang.ClassCastException
                at edu.exception.pack2.ExceptionEx2.method1(ExceptionEx2.java:38)
                at edu.exception.pack2.ExceptionRun2.main(ExceptionRun2.java:6)
                
                => () 내부에 아무런 문자열을 작성하지 않았기 때문에
                   예외가 발생한 상황에 대해서 개발자나 소비자가 어떤 예외상황인지 알 수 없게되는 문제가 있음.
                 */
                case 4: throw new RuntimeException();
                case 0:
                    System.out.println("프로그램 종료");
                    System.exit(0); // 프로그램이 종료됨
                default:
                    System.out.println("메뉴에 작성된 번호만 입력해주세요.");
            }
        }
    }

    /*
     try {
         switch (choice) {
            case 1: throw new ArithmeticException("개발자가 발생시킨 문제 1번");
            case 2: throw new NullPointerException("개발자가 발생시킨 문제 2번");
            case 3: throw new ClassCastException();
            case 4: throw new RuntimeException();
            case 0: System.out.println("프로그램 종료");
            default: System.out.println("메뉴에 작성된 번호만 입력해주세요.");
        }
    } catch (InputMismatchException e) { sc.nextLine();
    } catch (ArithmeticException    e) { System.out.println("계산적인 문제가 발생했습니다.");
    } catch (NullPointerException   e) { System.out.println("참조하는 객체가 없는데 객체를 참고하여 프로그램을 진행하려고 합니다.");
    } catch (ClassCastException     e) { System.out.println("클래스 참조 문제 발생");
    } catch (RuntimeException       e) { System.out.println("프로그램 실행 중 발생한 예외 처리 완료");
    }

        특정 문제가 발생했을 경우 현재 하고있는 기능을 잠시 중단한 후 문제를 해결하고,
        문제가 해결되면 다음 기능을 수행하도록 되어 있어 마찬가지로 break; 처리를 하지 않음.
        => throw new 자체에 return 이나 break 가 내장되어 있는 것과 같은 효과를 지니기 때문!

    case 1:
        throw new ArithmeticException("개발자가 발생시킨 문제 1번"); // 이미 멈췄는데
        break;      // 멈춘 다음 다시 돌아와 멈추는 기능을 진행한다~ 와 같다. => 또 멈춘다고? 하고 오류 발생
      => break; 를 두 번 작성한 것과 비슷한 효과를 가짐.
     */
    public void method2(){
        while (true) {
            try {
                System.out.println("[예외 강제 발생 시키기]");
                System.out.println("1. ArithmeticException");
                System.out.println("2. NullPointerException");
                System.out.println("3. ClassCastException");
                System.out.println("4. RuntimeException");
                System.out.println("0. 종료");
                System.out.print("예외 선택 >> ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1: throw new ArithmeticException("개발자가 발생시킨 문제 1번");
                    case 2: throw new NullPointerException("개발자가 발생시킨 문제 2번");
                    case 3: throw new ClassCastException();
                    case 4: throw new RuntimeException();
                    case 0:
                        System.out.println("프로그램 종료");
                        System.exit(0);
                    default: System.out.println("메뉴에 작성된 번호만 입력해주세요.");
                }
            } catch (InputMismatchException e) {
                System.out.println("input 내에 버퍼가 남아있습니다.");
                sc.nextLine(); // 입력 버퍼에 잘못 들어간 값을 제거
            } catch (ArithmeticException e) {
                System.out.println("계산적인 문제가 발생했습니다.");
                System.out.println("아래 단계에 따라 문제를 해결합시다.");
                // 산술적인 문제에 대한 대안을 개발자가 코드로 작성해서
                // 원활하게 진행될 수 있도록 설정
            } catch (NullPointerException e) {
                System.out.println("참조하는 객체가 없는데 객체를 참고하여 프로그램을 진행하려고 합니다.");
                // 특정 객체를 참조하지 못하는 상황에 대한 대안을 개발자가 코드로 작성해서
                // 원활하게 진행될 수 있도록 설정
            } catch (ClassCastException e) {
                System.out.println("클래스 참조 문제 발생");
                System.out.println("부모클래스 공간에서 자식클래스 메서드 실행했을 때 발생");
            } catch(RuntimeException e) {
                System.out.println("프로그램 실행 중 발생한 예외 처리 완료");
            }
        }
    }
    
    public void method3(){
        try {
            // 각종 예외를 강제로 발생시키고
        } catch (Exception e) { // 맨 위에 Exception 을 작성하면 모든 예외가 이곳에서 출력되기 때문에
                                // 이 밑에 catch 구문으로 예외상황에 따른 대응을 작성하더라도 대응 처리를 하지 못하기 때문에
                                // 맨 아래에 작성하는 것!!
            System.out.println("예외는 어떤 예외들이 뜨는지 확인 후 Line 146 위에 " +
                    "'catch(문제상황 e)' 로 개발자가 생각했을 때 문제인 상황들을 추가하여" +
                    "상황에 맞게 대비하는 것이 좋음.");
        }
    }
}




















