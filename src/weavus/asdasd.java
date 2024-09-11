//package weavus;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class asdasd {
//
//            //！！！mainメソッドの処理は書き換えないでください！！！
//            public static void main (String[] args) {
//
//                int totalPrice = 0 ;                                 //購入した商品の合計金額
//
//                //コマンドライン引数から購入した商品の合計金額（定価）を取得
//                List<String> list = new ArrayList<>();
//
//                for(String item: list) {
//                    System.out.println(item);
//            }
//                //discountメソッドを使って値引きを適用し、値引き後の金額を取得
//                int discountedPrice = (int)discount( totalPrice );        //値引き後の金額
//
//                //calcTaxPaymentメソッドを使って支払金額（税込）を取得
//                int taxPayment = (int)calcTaxPayment( discountedPrice );  //支払金額（税込）
//
//                //支払金額（税込）を表示
//                System.out.println("値引き後の支払金額：" + taxPayment + "円" );
//
//            }
//
//
//            /*
//             **以下の仕様を持つメソッドcalcTaxPaymentを作成してください。
//             **  - 引数として受け取った値の税込価格（消費税は8％とする）を計算して返す
//             **  - 税込価格は整数（小数点以下切り捨て）で返す
//             */
//            static double calcTaxPayment(int discountedPrice ){        //アンダーバーを適切な内容に書き換えてください
//                double calcTaxPayment = (discountedPrice*0.08)+ discountedPrice;
//                    return (int)calcTaxPayment;
//
//            }
//
//
//            /*
//             **以下の仕様を持つメソッドdiscountを作成してください。
//             **  - 引数として受け取った値が1000円以上5000円以下の場合、1000円より大きい分について10％割引にする
//             **  - 引数として受け取った値が5000円より大きい場合、1000円より大きく5000円以下の分について10％割引、5000円より大きい分について20％割引にする
//             **  - 値引き額は小数点以下切り捨てで計算する（キャストを使いましょう）
//             **  - 割引金額の上限は5000円とする
//             */
//            static double discount(int totalPrice ){            //アンダーバーを適切な内容に書き換えてください
//                if( totalPrice > 999 && totalPrice < 5001) {
//                    double discount = ((totalPrice-1000)*0.9)+1000;
//                    return (int)discount;
//            } else if ( totalPrice > 4999 ) {
//                    double discount = (((totalPrice-1000)*0.9)+1000) + (totalPrice-5000)*0.8;
//                    return discount;
//            } else {
//
//                }
//
//    }
//}
