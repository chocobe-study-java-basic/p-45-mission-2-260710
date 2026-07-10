/*
# 상품 재고 주문 처리 : 반복문과 조건문을 이용해 상품 재고 주문 처리를 구현하는 과제입니다.

## 요구사항
- 상품 재고는 처음에 5개로 시작한다.
- 주문은 1번 주문부터 10번 주문까지 총 10번 시도된다.
- 주문 처리는 반복문을 사용해서 구현한다. (항상 주문당 재고 1개 차감)
- 각 주문마다 현재 재고가 남아 있는지 확인한다.
- 재고가 1개 이상이면 주문 성공으로 처리한다.
- 주문이 성공하면 재고를 1개 감소시킨다.
- 재고가 0개이면 주문 실패로 처리한다.
- 주문이 실패한 경우에는 재고를 감소시키면 안 된다.
- 주문 처리 결과는 별도의 저장 없이 System.out.println()으로 출력한다.
- 주문 성공 시 출력 형식 : 1번 주문 성공, 남은 재고: 4
- 주문 실패 시 출력 형식 : 6번 주문 실패, 재고 없음
 */

public class Main {
    final static int INITIAL_REMAINING = 5;
    final static int ORDER_TOTAL_COUNT = 10;

    void main() {
        int remaining = Main.INITIAL_REMAINING;

        for (int order = 1; order <= Main.ORDER_TOTAL_COUNT; order++) {
            if (remaining > 0) {
                remaining--;
                System.out.printf("%d 주문 성공, 남은 재고: %d", order, remaining);
            } else {
                System.out.printf("%d 주문 실패, 재고 없음", order);
            }

            System.out.println();
        }
    }
}
