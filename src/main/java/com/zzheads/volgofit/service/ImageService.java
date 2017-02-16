package com.zzheads.volgofit.service;//

import org.springframework.stereotype.Service;

import java.io.IOException;

//  created by zzheads on 16.02.17
//

@Service
public interface ImageService {
    void save(String fileName, byte[] image) throws IOException;
    byte[] load(String fileName) throws IOException;
    void delete(String fileName);
}
