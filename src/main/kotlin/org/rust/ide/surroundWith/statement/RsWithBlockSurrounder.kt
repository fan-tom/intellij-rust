package org.rust.ide.surroundWith.statement

import com.intellij.openapi.project.Project
import org.rust.lang.core.psi.RsBlock
import org.rust.lang.core.psi.RsBlockExpr
import org.rust.lang.core.psi.RsPsiFactory

class RsWithBlockSurrounder : RsStatementsSurrounderBase.SimpleBlock<RsBlockExpr>() {
    override fun getTemplateDescription(): String = "{}"

    override fun createTemplate(project: Project): Pair<RsBlockExpr, RsBlock> {
        val block = RsPsiFactory(project).createBlockExpr("\n")
        return block to block.block!!
    }
}
