package com.sevak_avet.Console;

import com.sevak_avet.Cryption.DecryptionCezar;
import com.sevak_avet.Cryption.EncryptCezar;

public class Main {
	public static void main(String[] args) {
		/**
		 * �.�.������ "� ��� �����" 1829�
		 */

		EncryptCezar enc = new EncryptCezar(
				"� ��� �����: ������ ���, ���� �����, \n"
						+ "� ���� ���� ������ �� ������; \n"
						+ "�� ����� ��� ��� ������ �� ��������; \n"
						+ "� �� ���� �������� ��� �����. \n"
						+ "� ��� ����� ���������, ����������, \n"
						+ "�� ��������, �� ��������� �����; \n"
						+ "� ��� ����� ��� ��������,��� �����, \n"
						+ "��� ��� ��� ��� ������� ���� ������. \n", 7);

		System.out.println(enc.getEncText());

		DecryptionCezar dec = new DecryptionCezar(enc);
		System.out.println(dec.getDecText());

		/**
		 * �.������� "����� � ���������"
		 */

		EncryptCezar encRomeo = new EncryptCezar(
				"A glooming peace this morning with it brings; \n"
						+ "The sun, for sorrow, will not show his head: \n"
						+ "Go hence, to have more talk of these sad things; \n"
						+ "Some shall be pardon'd, and some punished: \n"
						+ "For never was a story of more woe \n"
						+ "Than this of Juliet and her Romeo. \n", 7);

		System.out.println(encRomeo.getEncText());

		DecryptionCezar decRomeo = new DecryptionCezar(encRomeo);
		System.out.println(decRomeo.getDecText());
	}
}
