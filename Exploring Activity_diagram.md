The Activity Diagram is comprised of the following model elements.</br>
</br>
Initial State:</br>
</br>
An initial state is a model element that explicitly shows the beginning of a workflow on an
activity diagram. It is the point at which reading of the activity diagram begins. Because
activity diagram shows a sequence of actions, it must indicate the starting point of the
sequence using the initial state element.</br>
</br>
The initial state is drawn as a solid circle with an optional name or label.
</br>
</br>
Action:</br>
</br>
An Action is a model element that represents the performance of a task in a workflow or
operation. Each action must occur before the workflow continues to the next element on an
activity diagram. An action is a non-interruptible task that takes place during an activity.
Action may be nested - i.e. action may have sub-actions.</br></br>
Action is drawn as a capsule shaped rounded rectangle with a name or description 
</br></br>
Transition</br></br>
"Transition" element connects the various elements of the activity diagram. Typically the
transition element represents the workflow between two or more actions or other elements of
the activity diagram.</br></br>
It is drawn as a solid line with open arrowhead.</br></br>
"Transition" element can have an optional label enclosed in square brackets called "guard
condition" or simply "guard".

Decision point</br></br>
A Decision is a model element that typically has one incoming transition and two or more
outgoing transitions based upon the outcome of guard conditions from the previous element.</br></br>
Decision is drawn as a diamond shape usually without a name or label (no need for
name/label because the guard conditions usually imply the reason for the decision)</br></br>
Transitions that leave a decision model element often have guard conditions.

Naming standards</br></br>
Initial State Naming</br></br>
• It is a good practice to name the initial state although it is not mandatory.
• The name of the initial state should describe its purpose.
• Always use verbs to name the initial state such as "begin pre-screening", "start loan
application processing".

Action Naming</br></br>
• The name of the Action should describe its purpose.
• It is a good practice to name the Action starting with a verb and indicating the activity
that takes place in the action.
