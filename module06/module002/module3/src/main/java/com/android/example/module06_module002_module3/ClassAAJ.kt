package com.android.example.module06_module002_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: com.android.example.module06_module002_module5.ClassAAB = com.android.example.module06_module002_module5.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module06_module002_module5.ClassAAD = com.android.example.module06_module002_module5.ClassAAD()
	private 	val instance_var_1_2: com.android.example.module06_module002_module5.ClassAAF = com.android.example.module06_module002_module5.ClassAAF()
	private 	val instance_var_1_3: com.android.example.module06_module002_module5.ClassAAF = com.android.example.module06_module002_module5.ClassAAF()
	private 	val instance_var_1_4: com.android.example.module06_module002_module2.ClassAAD = com.android.example.module06_module002_module2.ClassAAD()

	fun method0(
		param0: com.android.example.module06_module002_module2.ClassAAA
	) {
		val local_var_2_1: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_1.dispose()

	}

	fun method1(
		param0: com.android.example.module06_module002_module5.ClassAAJ,
		param1: com.android.example.module06_module002_module5.ClassAAD
	) {
		listOf("1", "2", "3").forEach {
			for (iAb in 0..5) {
				param0.method0(dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory())

				param0.method1(dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory())

				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.onNext(kotlin.Any())

				val local_var_4_1: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
				local_var_4_1.isCancelled()

			}
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.cancel()

		}
		val local_var_2_2: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_2.assertSubscribed()

		val local_var_2_3: io.reactivex.internal.util.AppendOnlyLinkedArrayList<kotlin.Any> = io.reactivex.internal.util.AppendOnlyLinkedArrayList(58)
		local_var_2_3.setFirst(kotlin.Any())

	}
}
