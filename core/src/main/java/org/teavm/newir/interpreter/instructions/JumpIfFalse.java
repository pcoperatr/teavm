/*
 *  Copyright 2021 Alexey Andreev.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.teavm.newir.interpreter.instructions;

import org.teavm.newir.interpreter.InstructionPrinter;
import org.teavm.newir.interpreter.InterpreterContext;

class JumpIfFalse extends Jump {
    public final int slot;

    JumpIfFalse(int slot) {
        this.slot = slot;
    }

    JumpIfFalse(int slot, int target) {
        this.slot = slot;
        this.target = target;
    }

    @Override
    public void setTarget(int target) {
        this.target = target;
    }

    @Override
    public void exec(InterpreterContext context) {
        if (context.iv[slot] == 0) {
            context.ptr = target;
        } else {
            context.ptr++;
        }
    }

    @Override
    public void print(InstructionPrinter p) {
        p.opcode("jfalse").arg().label(target).arg().intVar(slot);
    }
}
