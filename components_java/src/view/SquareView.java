package view;

/**
 * ����� ������������� ���������� �������� � �������, ��������� ���������� ShapeView
 */
public class SquareView implements ShapeView {
    /**
     * ����� ��� ������ ������� �������� � �������
     *
     * @param area ������� ��������
     */
    @Override
    public void showArea(double area) {
        System.out.println("������� ��������: " + area);
    }

    /**
     * ����� ��� ������ ��������� �������� � �������
     *
     * @param perimeter �������� ��������
     */
    @Override
    public void showPerimeter(double perimeter) {
        System.out.println("�������� ��������: " + perimeter);
    }
}