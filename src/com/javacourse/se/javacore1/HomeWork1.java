/*
 * JavaCore. Homework 1
 *
 * @ author Batanowa Elena
 *
 * @ version ideaIC-2021.3
 */

package com.javacourse.se.javacore1;

public class HomeWork1 {
    public static void main(String[] args) {
        Course c = new Course(); // Создаем полосу препятствий
        Team team = new Team("MortalCombat"); // Создаем команду
        c.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты
    }
}
