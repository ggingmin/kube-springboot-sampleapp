package com.ggingmin.waitinglist.service;

import com.ggingmin.waitinglist.domain.Guest;
import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.Collections;
import java.util.List;

@Service
public class GuestService {

    @Autowired
    private GuestRepository guestRepository;

    private final Parser parser = Parser.builder().build();
    private final HtmlRenderer renderer = HtmlRenderer.builder().build();

    private SequenceGeneratorService sequenceGenerator;

    public void save(String content, Model model) {
        if (content != null && !content.trim().isEmpty()) {

            Node document = parser.parse(content.trim());
            String html = renderer.render(document);

            Guest guest = new Guest(content,null);
//            guest.setId(sequenceGenerator.generateSequence(Guest.SEQUENCE_NAME));
            guestRepository.save(guest);
            model.addAttribute("content", "");
        }
    }

    public void findAll(Model model) {
        List<Guest> guests = guestRepository.findAll();
        Collections.reverse(guests);
        model.addAttribute("guests", guests);
    }
}
