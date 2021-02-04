package com.android.example.module02_module37_module27_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module02_module37_module27_module1.ClassAAC = com.android.example.module02_module37_module27_module1.ClassAAC()
	private 	val instance_var_1_1: com.android.example.module02_module37_module27_module1.ClassAAE = com.android.example.module02_module37_module27_module1.ClassAAE()
	private 	val instance_var_1_2: com.android.example.module02_module37_module27_module1.ClassAAG = com.android.example.module02_module37_module27_module1.ClassAAG()
	private 	val instance_var_1_3: com.android.example.module02_module37_module27_module1.ClassAAG = com.android.example.module02_module37_module27_module1.ClassAAG()

	fun method0(
		param0: com.android.example.module02_module37_module27_module1.ClassAAG
	) {
		for (iAb in 0..0) {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
				local_var_4_0.createWorker()

				local_var_4_0.triggerActions()

			}
			val local_var_3_0: io.reactivex.internal.queue.MpscLinkedQueue<kotlin.Any> = io.reactivex.internal.queue.MpscLinkedQueue()
			local_var_3_0.offer(kotlin.Any(), kotlin.Any())

			val local_var_3_1: io.reactivex.internal.queue.MpscLinkedQueue<kotlin.Any> = io.reactivex.internal.queue.MpscLinkedQueue()
			local_var_3_1.offer(kotlin.Any())

			local_var_3_0.isEmpty()

		}
		val local_var_2_1: io.reactivex.internal.queue.MpscLinkedQueue<kotlin.Any> = io.reactivex.internal.queue.MpscLinkedQueue()
		local_var_2_1.clear()

	}

	fun method1(
		param0: com.android.example.module02_module37_module27_module1.ClassAAF,
		param1: com.android.example.module02_module37_module27_module3.ClassAAG,
		param2: com.android.example.module02_module37_module27_module1.ClassAAG
	) {
		val local_var_2_3: io.reactivex.internal.queue.MpscLinkedQueue<kotlin.Any> = io.reactivex.internal.queue.MpscLinkedQueue()
		local_var_2_3.offer(kotlin.Any(), kotlin.Any())

		val local_var_2_4: io.reactivex.internal.queue.MpscLinkedQueue<kotlin.Any> = io.reactivex.internal.queue.MpscLinkedQueue()
		local_var_2_4.offer(kotlin.Any())

		val local_var_2_5: io.reactivex.internal.queue.MpscLinkedQueue<kotlin.Any> = io.reactivex.internal.queue.MpscLinkedQueue()
		local_var_2_5.isEmpty()

	}

	fun method2(
		param0: com.android.example.module02_module37_module27_module3.ClassAAG,
		param1: com.android.example.module02_module37_module27_module1.ClassAAC,
		param2: com.android.example.module02_module37_module27_module3.ClassAAC
	) {
		param0.method1("SomeString")

		param0.method1("SomeString")

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onNext(kotlin.Any())

	}
}
