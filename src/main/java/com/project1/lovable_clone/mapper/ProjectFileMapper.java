package com.project1.lovable_clone.mapper;


import com.project1.lovable_clone.dto.project.FileNode;
import com.project1.lovable_clone.entity.ProjectFile;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectFileMapper {

    List<FileNode> toListOfFileNode(List<ProjectFile> projectFileList);
}
