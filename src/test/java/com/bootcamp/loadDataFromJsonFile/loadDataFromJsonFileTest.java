/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.loadDataFromJsonFile;

import com.bootcamp.TestUtils;
import com.bootcamp.commons.utils.GsonUtils;
import com.bootcamp.constants.AppConstants;
import com.bootcamp.entities.*;

import com.bootcamp.repositories.*;
import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.google.gson.reflect.TypeToken;
import org.testng.annotations.Test;

import java.io.File;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Iso-Doss
 */
public class loadDataFromJsonFileTest {

    private final PlainteRepository plainteRepository = new PlainteRepository(AppConstants.PERSISTENCE_UNIT);
    private final CommentaireRepository commentaireRepository = new CommentaireRepository(AppConstants.PERSISTENCE_UNIT);
    private final EtapeRepository etapeRepository = new EtapeRepository(AppConstants.PERSISTENCE_UNIT);
    private final NoteRepository noteRepository = new NoteRepository(AppConstants.PERSISTENCE_UNIT);
    private final WorkFlowRepository workFlowRepository = new WorkFlowRepository(AppConstants.PERSISTENCE_UNIT);
    private final UserRepository userRepository = new UserRepository(AppConstants.PERSISTENCE_UNIT);

    @Test(priority = 0, groups = {"load plainte Data From JsonFile Test"})
    public void loadDataPlainteFromJsonFile() throws Exception {
        TestUtils testUtils = new TestUtils();
        File dataFile = testUtils.getFile("data-json" + File.separator + "plainte.json");

        String text = Files.toString(new File(dataFile.getAbsolutePath()), Charsets.UTF_8);

        Type typeOfObjectsListNew = new TypeToken<List<Plainte>>() {
        }.getType();
        List<Plainte> plaintes = GsonUtils.getObjectFromJson(text, typeOfObjectsListNew);

        for (int i = 0; i < plaintes.size(); i++) {
            Plainte get = plaintes.get(i);

            plainteRepository.create(get);
        }

    }

    @Test(priority = 1, groups = {"load commentaire Data From JsonFile Test"})
    public void loadDataCommentaireFromJsonFile() throws Exception {
        TestUtils testUtils = new TestUtils();
        File dataFile = testUtils.getFile("data-json" + File.separator + "commentaires.json");

        String text = Files.toString(new File(dataFile.getAbsolutePath()), Charsets.UTF_8);

        Type typeOfObjectsListNew = new TypeToken<List<Commentaire>>() {
        }.getType();
        List<Commentaire> commentaires = GsonUtils.getObjectFromJson(text, typeOfObjectsListNew);
        for (int i = 0; i < commentaires.size(); i++) {
            Commentaire get = commentaires.get(i);
            commentaireRepository.create(get);
        }
    }
    

    @Test(priority = 2, groups = {"load etape Data From JsonFile Test"})
    public void loadDataEtapeFromJsonFile() throws Exception {
        TestUtils testUtils = new TestUtils();
        File dataFile = testUtils.getFile("data-json" + File.separator + "etape.json");

        String text = Files.toString(new File(dataFile.getAbsolutePath()), Charsets.UTF_8);

        Type typeOfObjectsListNew = new TypeToken<List<Etape>>() {
        }.getType();
        List<Etape> etapes = GsonUtils.getObjectFromJson(text, typeOfObjectsListNew);
        for (int i = 0; i < etapes.size(); i++) {
            Etape get = etapes.get(i);
            etapeRepository.create(get);
        }

    }

    @Test(priority = 3, groups = {"load note Data From JsonFile Test"})
    public void loadDataNoteFromJsonFile() throws Exception {
        TestUtils testUtils = new TestUtils();
        File dataFile = testUtils.getFile("data-json" + File.separator + "note.json");

        String text = Files.toString(new File(dataFile.getAbsolutePath()), Charsets.UTF_8);

        Type typeOfObjectsListNew = new TypeToken<List<Note>>() {
        }.getType();
        List<Note> notes = GsonUtils.getObjectFromJson(text, typeOfObjectsListNew);
        for (int i = 0; i < notes.size(); i++) {
            Note get = notes.get(i);
            noteRepository.create(get);
        }

    }

    @Test(priority = 4, groups = {"load user Data From JsonFile Test"})
    public void loadDataUserFromJsonFile() throws Exception {
        TestUtils testUtils = new TestUtils();
        File dataFile = testUtils.getFile("data-json" + File.separator + "user.json");

        String text = Files.toString(new File(dataFile.getAbsolutePath()), Charsets.UTF_8);

        Type typeOfObjectsListNew = new TypeToken<List<User>>() {
        }.getType();
        List<User> users = GsonUtils.getObjectFromJson(text, typeOfObjectsListNew);
        for (int i = 0; i < users.size(); i++) {
            User get = users.get(i);
            userRepository.create(get);
        }

    }

    @Test(priority = 5, groups = {"load workflow Data From JsonFile Test"})
    public void loadDataWorkflowFromJsonFile() throws Exception {
        TestUtils testUtils = new TestUtils();
        File dataFile = testUtils.getFile("data-json" + File.separator + "workflow.json");

        String text = Files.toString(new File(dataFile.getAbsolutePath()), Charsets.UTF_8);

        Type typeOfObjectsListNew = new TypeToken<List<WorkFlow>>() {
        }.getType();
        List<WorkFlow> workFlow = GsonUtils.getObjectFromJson(text, typeOfObjectsListNew);
        for (int i = 0; i < workFlow.size(); i++) {
            WorkFlow get = workFlow.get(i);
            workFlowRepository.create(get);
        }

    }

}
