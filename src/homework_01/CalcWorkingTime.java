package homework_01;

import java.sql.Time;

public class CalcWorkingTime {

    public static void main(String[] args) {

        // �v�Z�p�̐��l��萔�ŗp��
        final long ONE_HOUR_BY_MILLI_SEC = 1000 * 60 * 60; // 1���Ԃ̃~���b���Z
        final long ONE_MIN_BY_MILLI_SEC  = 1000 * 60;      // 1���̃~���b���Z
        final int  ONE_HOUR_BY_MIN       = 60;             // 1���Ԃ̕����Z

        // �o�C�g�̊J�n���ԂƏI�����Ԃ��R�}���h���C����������󂯎��
        Time startTime  = Time.valueOf(args[0]);
        Time finishTime = Time.valueOf(args[1]);

        // getTime���\�b�h���g���ĘJ�����Ԃ��~���b�i0.001�b�P�ʁj�Ŏ擾����
        // ��getTime()���\�b�h�̖߂�l��long�^�ł��邱�Ƃɒ���
        long workingTime = finishTime.getTime() - startTime.getTime();

        // �~���b�Ŏ擾�����J�����Ԃ������ԁ����̌`���ɒ���
        int workingHour = (int)( workingTime / ONE_HOUR_BY_MILLI_SEC );                      // ���ԂɊ��Z
        int workingMin  = (int)( ( workingTime / ONE_MIN_BY_MILLI_SEC ) % ONE_HOUR_BY_MIN ); // ���Ɋ��Z

        // �o��
        System.out.println("�{���̘J�����Ԃ�" + workingHour + "����" + workingMin + "���ł��B");
    }
}
