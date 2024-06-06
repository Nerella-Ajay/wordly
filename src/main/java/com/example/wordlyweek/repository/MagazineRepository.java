/*
 * You can use the following import statements
 *
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */

// Write your code here
package com.example.wordlyweek.repository;

import com.example.wordlyweek.model.*;
import java.util.ArrayList;
import java.util.List;

public interface MagazineRepository {
    ArrayList<Magazine> getMagazines();

    Magazine getMagazineById(int magazineId);

    Magazine addMagazine(Magazine magazine);

    Magazine updateMagazine(int magazineId, Magazine magazine);

    void deleteMagazine(int magazineId);

    List<Writer> getWriterMagazines(int magazineId);
}