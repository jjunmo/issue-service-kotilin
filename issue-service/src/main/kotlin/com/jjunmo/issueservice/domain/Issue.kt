package com.jjunmo.issueservice.domain

import com.jjunmo.issueservice.domain.enums.IssuePriority
import com.jjunmo.issueservice.domain.enums.IssueStatus
import com.jjunmo.issueservice.domain.enums.IssueType
import javax.persistence.*

@Entity
@Table
class Issue(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column
    var userId : String,

    @Column
    var summary : String,

    @Column
    var description : String,

    @Column
    @Enumerated(EnumType.STRING)
    var type : IssueType,

    @Column
    @Enumerated(EnumType.STRING)
    var priority : IssuePriority,

    @Column
    @Enumerated(EnumType.STRING)
    var status: IssueStatus,

    ) : BaseEntity()